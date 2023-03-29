package Even_Odd;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		// using switch 
		switch(num%2)
		{
		case 0:
			System.out.println(num+", is even number");
			break;
			
		case 1:
			System.out.println(num+", is odd number");
			break;
		}
	}

}
