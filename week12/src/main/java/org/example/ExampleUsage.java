package org.example;

/**
 * This class demonstrates various usage examples including filtering data, summing arrays, and processing matrices.
 */
public class ExampleUsage {

    /**
     * Demonstrates using loops to filter and display even numbers from an array.
     */
    public void displayEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Display even numbers only
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }

    /**
     * Sums an array of integers demonstrating the use of loops and variable scope.
     *
     * @return the sum of the array elements.
     */
    public int sumArray() {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0; // Correct usage of variable scope
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        return sum;
    }

    /**
     * Demonstrates using nested loops to process a multidimensional array (matrix).
     */
    public void processMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Iterate over each row and column of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }
}
