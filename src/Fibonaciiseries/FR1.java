package Fibonaciiseries;

public class FR1 {

	public static void main(String[] args) {
		        int n = 4; // number of terms to generate
		        for (int i = 0; i < n; i++) {
		            System.out.print(fibonacci(i) + " ");
		        }
		    }

		    public static int fibonacci(int n) {
		        if (n <= 1) {
		            return n;
		        } else {
		            return fibonacci(n-1) + fibonacci(n-2);
		        }
		    }
		
	}


