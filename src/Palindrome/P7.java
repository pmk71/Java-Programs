package Palindrome;

import java.util.Scanner;
// second method to find sum of nth numbers
public class P7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number");
		int num=sc.nextInt();
		int n=1;
		int sum=0;
		
		while(n<=num)
		{
			sum+=n;
			n++;
		}
		System.out.println("the sum: "+sum);
	}

}
