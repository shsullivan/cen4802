package com.sullivan.fibonacciapp;

/**
 * <h1>Fibonacci App</h1>
 * @author Shawn Sullivan
 * CEN 4802C - 14150 <br>
 * August 21, 2025 <br>
 * This application provides the user with the integer at a predetermined location in the Fibonacci sequence and
 * includes the main method and one recursive method used to calculate that integer in the Fibonacci sequence.
 */

public class FibonacciApp {

    /**
     * Returns a number in the Fibonacci sequence at the location in the sequence provided as the argument.
     * @param  n integer provided indicating the position to be calculated in the Fibonacci sequence
     * @return integer calculated as the nth term in the Fibonacci sequence
     */
    public static int recursiveFibonacci(int n) {
        // Base calculation case
        if (n <= 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        // Recursive step
        else {
            return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
    }

    /**
     * Initializes the Fibonacci App and calls the necessary function to output expected information to the user
     * @param args no args passed for this iteration of the program
     */
    public static void main(String[] args) {
        int number = 10;
        System.out.println("The " + number + "th term in the Fibonacci sequence is " + recursiveFibonacci(number));
    }
}
