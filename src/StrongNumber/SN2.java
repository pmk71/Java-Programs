package StrongNumber;

import java.util.Scanner;

public class SN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("the the number");
int num=sc.nextInt();
int temp=num;
int sum=0;

while(num>0)
{
	int rem=num%10;
	int f=1;
	while(rem>0)
	{
		f=f*rem;
		rem--;
	}
	sum+=f;
	num/=10;
}
System.out.println(sum);
	}

}
