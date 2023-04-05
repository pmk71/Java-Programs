package Factorial;

public class FR1 {
	    public static void main(String[] args) {
	        int n = 4; // the number to calculate the factorial of
	        System.out.println(factorial(n));
	    }

	    public static int factorial(int n) {
	        if (n == 0) {
	            return 1;
	        } else {
	            return n * factorial(n-1);
	        }
	    }
	}


