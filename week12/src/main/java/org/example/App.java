package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        LoopControl loopControl = new LoopControl();
        ExampleUsage exampleUsage = new ExampleUsage();

        // Displaying the correct and incorrect variable usage
        System.out.println("Demonstrating correct variable usage:");
        loopControl.correctVariableUsage();
        System.out.println("\nDemonstrating incorrect variable usage:");
        loopControl.incorrectVariableUsage();

        // Demonstrating empty block usage
        System.out.println("\nDemonstrating empty block usage (should handle without output):");
        loopControl.avoidEmptyBlock();

        // Demonstrating modified control variable
        System.out.println("\nDemonstrating correctly modified control variable:");
        loopControl.correctlyModifiedControlVariable();
        System.out.println("\nDemonstrating incorrectly modified control variable:");
        loopControl.modifiedControlVariable();

        // Using ExampleUsage class to show practical uses of loops
        System.out.println("\nDisplaying even numbers:");
        exampleUsage.displayEvenNumbers();

        // Summing an array
        System.out.println("\nSumming an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        // Processing a matrix
        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();
    }
}
