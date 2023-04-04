package AmstrongNumber;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int power=0;
		int sum=0;
		int temp=num;
		int temp1=num;
	
		
		while(num>0)
		{
			num=num/10;
			power++;
		}
		System.out.println(power);
while(temp>0)
{
	int rem=temp%10;
	int p=1;
for(int i=1;i<=power;i++)
	{
		p=p*rem;
	
	}
	sum=sum+p;
	temp=temp/10;
	}


	if(temp1==sum)
		System.out.println("the number is Amstrong");
	else
		System.out.println("the number is not amstrong number");
}
}

