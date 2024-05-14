package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for LoopControl.
 */
public class LoopControlTest extends TestCase {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testCorrectVariableUsage() {
        LoopControl loopControl = new LoopControl();
        loopControl.correctVariableUsage();

        String output = outContent.toString();
        assertTrue(output.contains("Preparing to loop..."));
        assertTrue(output.contains("0"));
        assertTrue(output.contains("1"));
        assertTrue(output.contains("2"));
        assertTrue(output.contains("3"));
        assertTrue(output.contains("4"));
    }

    @Test
    public void testIncorrectVariableUsage() {
        LoopControl loopControl = new LoopControl();
        loopControl.incorrectVariableUsage();

        String output = outContent.toString();
        assertTrue(output.contains("Preparing to loop..."));
        assertTrue(output.contains("0"));
        assertTrue(output.contains("1"));
        assertTrue(output.contains("2"));
        assertTrue(output.contains("3"));
        assertTrue(output.contains("4"));
    }

    @Test
    public void testAvoidEmptyBlock() {
        LoopControl loopControl = new LoopControl();
        loopControl.avoidEmptyBlock();

        String output = outContent.toString();
        assertTrue(output.contains("Midpoint at: 5"));
        assertTrue(output.contains("Current index: 0"));
        assertTrue(output.contains("Current index: 1"));
        assertTrue(output.contains("Current index: 2"));
        assertTrue(output.contains("Current index: 3"));
        assertTrue(output.contains("Current index: 4"));
        assertTrue(output.contains("Current index: 6"));
        assertTrue(output.contains("Current index: 7"));
        assertTrue(output.contains("Current index: 8"));
        assertTrue(output.contains("Current index: 9"));
    }

    @Test
    public void testModifiedControlVariable() {
        LoopControl loopControl = new LoopControl();
        loopControl.modifiedControlVariable();

        String output = outContent.toString();
        assertTrue(output.contains("Adjusting loop index from 5"));
        assertTrue(output.contains("to 8"));
    }

    @Test
    public void testCorrectlyModifiedControlVariable() {
        LoopControl loopControl = new LoopControl();
        loopControl.correctlyModifiedControlVariable();

        String output = outContent.toString();
        assertTrue(output.contains("Adjusting loop index from 5"));
        assertTrue(output.contains("to 8"));
    }
}
