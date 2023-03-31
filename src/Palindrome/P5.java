package Palindrome;
// to find the sum of nth given number;
import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth number");
		int num=sc.nextInt();
		int sum=0;

	
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("the sum of nth number is "+sum);



	}
}
