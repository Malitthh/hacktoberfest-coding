package interview.questions;

public class FibonacciSeries {

	public static void main(String[] args) {
        // Define the first two Fibonacci numbers
        int fib1 = 0;
        int fib2 = 1;
        
        // Number of elements needed in the series
        int numElements = 7;
        
        // Print the first two Fibonacci numbers
        System.out.print(fib1 + ", " + fib2);
        
        // Generate and print the rest of the Fibonacci series
        for (int i = 2; i < numElements; i++) {
            int nextFib = fib1 + fib2;
            System.out.print(", " + nextFib);
            // Update the previous two Fibonacci numbers
            fib1 = fib2;
            fib2 = nextFib;
        }

	}

}
