package Neon_Number;
// Program to check the given number is neon number or not
import java.util.Scanner;

public class N1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int sq=num*num;
int sum=0;

//if square of number and sum of sq digits is equal to number than we can say number is neon
while(sq>0)
{
	int rem=sq%10;
	sum=sum+rem;
	sq=sq/10;
}
if (num==sum)
	System.out.println("The number is neon number");
else
	System.out.println("the number is not neon number");

}
}

