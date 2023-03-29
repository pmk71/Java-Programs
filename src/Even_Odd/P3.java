package Even_Odd;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		

		// BY using conditional statements and not using % operator
		if((num/2)*2==num)
		
			System.out.println(num+"is even number");
		
		else
			System.out.println(num+"is odd number");

			}


	}

