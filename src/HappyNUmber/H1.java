package HappyNUmber;
//WAJP to check the given number is happy number or not
import java.util.Scanner;

public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();


while(num>9)
{
	int sum=0;
	while(num>0)
	{
		int rem=num%10;
		sum=sum+(rem*rem);
		num=num/10;
		
	}
	num=sum;
}

if(num==1||num==7)
	System.out.println("the number is happy number");
else
	System.out.println("the number is not a happy number");
	}

}
