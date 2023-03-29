package Even_Odd;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();

// BY using conditional statements
if(num%2==0)
{
	System.out.println(num+"is even number");
}
else
	System.out.println(num+"is odd number");

	}

}
