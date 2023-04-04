package AmstrongNumber;

import java.util.Scanner;

public class Am3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int num=sc.nextInt();
int temp=num;
int temp1=num;
int sum=0;
int power=0;
while(num>0)
{
	num=num/10;
	power++;
}
System.out.println(power);

while(temp>0)
{
	int rem=temp%10;
	int p=power;
	int pr=1;
	while(p>0)
	{
	pr=pr*rem;	
	p--;
	}
	sum=sum+pr;
	temp=temp/10;
	
}
System.out.println(sum);
	}

}
