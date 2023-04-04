package Neon_Number;

import java.util.Scanner;

public class N3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int sq=num*num;
int sum=0;
System.out.println(sq);

while(sq>0)
{
	int rem=sq%10;
	sum=sum+rem;
	sq/=10;
}
System.out.println(sum);
if (num==sum)
	System.out.println("the number is neon number");
else
	System.out.println("the number is not neon number");
	}

}
