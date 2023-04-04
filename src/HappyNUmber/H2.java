package HappyNUmber;

import java.util.Scanner;

public class H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
String res=isHappy(num);
System.out.println(res);

	}

	private static String isHappy(int num) {
		// TODO Auto-generated method stub
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
		return "Happy number";
		else
			return "Not happy Number";
	}

}
