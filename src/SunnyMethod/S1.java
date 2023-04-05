package SunnyMethod;

import java.util.Scanner;

//WAJP to check given number or not
//if number+1==perfect square number than number is said to be sunny number
public class S1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=sc.nextInt();
int count=0;
int i=1;
while(i<(num/2))
{
	if(i*i==num+1)
	{
		count++;
		break;
	}
	i++;
}
if(count==0)
	System.out.println("not a sunny number");
else
	System.out.println("it a sunny number");
	
}
}
	