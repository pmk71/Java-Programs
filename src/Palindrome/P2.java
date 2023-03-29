package Palindrome;
// Program to count number of digits present in the number
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number ");
			int num=sc.nextInt();
			int count=0;
			int temp=num;
		while(num>0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		
		System.out.println("the Number of digits present in number, "+temp+" is "+ count);
			
	}

}
