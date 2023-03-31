package Palindrome;
// program to find the number is positive or negative
import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number");
		int num=sc.nextInt();
		// if number grater than zero we say number is positive else negative
		if(num==0)
			System.out.println("the number is zero");
		else if(num>0)
			System.out.println("the number is positive");
		else 
			System.out.println("the number is negative");
			
	}

}
