package org.example;

/**
 * This class demonstrates various loop control structures and their usage.
 * It includes examples to avoid common mistakes and adhere to coding standards.
 */
public class LoopControl {

    /**
     * Demonstrates the correct usage of variable declaration and initialization
     * close to its first usage within a method.
     */
    public void correctVariableUsage() {
        // Declaration and initialization close to the first usage
        int index = 0;
        System.out.println("Preparing to loop...");
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    public void incorrectVariableUsage() {
        int index;
        // Some other code
        System.out.println("Preparing to loop...");
        // Loop starts much later after declaration
        index = 0;
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }

    /**
     * Demonstrates a loop with a conditional statement.
     * The method prints a message at the midpoint of the loop
     * and ensures there are no empty blocks.
     */
    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            } else {
                // Meaningful statement inside the else block
                System.out.println("Current index: " + j);
            }
        }
    }


    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Incorrect - modifying control variable inside the loop
                System.out.println("to " + m);
            }
        }
    }
    /**
     * Demonstrates how to avoid modifying the control variable inside a loop.
     * Instead, a separate variable is used for any adjustments needed within the loop.
     */
    public void correctlyModifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Correct - modifying a separate variable inside the loop
                System.out.println("to " + m);
            }
        }
    }
}
