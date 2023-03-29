package Palindrome;
// Program to reverse from its unit place
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		
	// As we are not aware of exit condition 
//		we are going to while loop
		
		while(num>0)
		{
			int rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
	}

}
