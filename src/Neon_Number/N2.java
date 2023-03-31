package Neon_Number;
// create a method to check the given number is neon number or not
import java.util.Scanner;

public class N2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		String res=isNeon(num);
		System.out.println(res);
	}
	
	public static String isNeon(int num)
	{
		int sum=0;
		int sq=num*num;
		while(sq>0)
		{
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(num==sum)
		return "neon";
		else
		return "not a neon";
	}

}
