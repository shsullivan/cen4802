package com.sullivan.fibonacciapp;

public class FibonacciApp {

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

    public static void main(String[] args) {
        int number = 10;
        System.out.println("The " + number + "th term in the Fibonacci sequence is " + recursiveFibonacci(number));
    }
}
