package org.example;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for ExampleUsage.
 */
public class ExampleUsageTest extends TestCase {

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
    public void testDisplayEvenNumbers() {
        ExampleUsage exampleUsage = new ExampleUsage();
        exampleUsage.displayEvenNumbers();

        String output = outContent.toString();
        assertTrue(output.contains("Even number: 2"));
        assertTrue(output.contains("Even number: 4"));
        assertTrue(output.contains("Even number: 6"));
        assertTrue(output.contains("Even number: 8"));
        assertTrue(output.contains("Even number: 10"));
    }

    @Test
    public void testSumArray() {
        ExampleUsage exampleUsage = new ExampleUsage();
        int sum = exampleUsage.sumArray();

        assertEquals(75, sum);
        assertTrue(outContent.toString().contains("Sum of array: 75"));
    }

    @Test
    public void testProcessMatrix() {
        ExampleUsage exampleUsage = new ExampleUsage();
        exampleUsage.processMatrix();

        String output = outContent.toString();
        assertTrue(output.contains("Element at [0][0] is 1"));
        assertTrue(output.contains("Element at [0][1] is 2"));
        assertTrue(output.contains("Element at [0][2] is 3"));
        assertTrue(output.contains("Element at [1][0] is 4"));
        assertTrue(output.contains("Element at [1][1] is 5"));
        assertTrue(output.contains("Element at [1][2] is 6"));
        assertTrue(output.contains("Element at [2][0] is 7"));
        assertTrue(output.contains("Element at [2][1] is 8"));
        assertTrue(output.contains("Element at [2][2] is 9"));
    }
}
