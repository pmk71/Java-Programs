package Palindrome;
// design the method to check the given number is palindrome or not
import java.util.Scanner;

public class PalindromeMehtod {
	
	public static void palindrome(int num)
	{
		int rev=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		if(rev==temp)
			System.out.println("the number is palindrome");
		else
			System.out.println("the number is not palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
palindrome(num);
	}

}
