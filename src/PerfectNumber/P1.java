package PerfectNumber;

import java.util.Scanner;

//WJP to check whether the given number is perfect number or not, 
//the objective is to check whether or not the number can be represented as the sum of its factors except the number itself. 
//Therefore, we write a code to Check Whether or Not a Number is a Perfect Number in Java Language.
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int i=1;
int sum=0;


//we need to find factors of number 
//example 6 the factors(perfect divisors are 1,2,3,)
//so 6=(1+2+3)

while(i<=(num/2))
{
	if(num%i==0)
	{
		sum=sum+i;
	}
	i++;
	
}
if (sum==num)
	System.out.println("the number is perfect");
else
	System.out.println("the number is not perfect");
	}

}
