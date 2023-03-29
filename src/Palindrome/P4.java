package Palindrome;
// TO check the given number is palindrome or not
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}

		if(temp==rev)
			System.out.println("The given number is palindrome");
		else
			System.out.println("the given number is not palindrome");
	}

}
