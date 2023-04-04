package PerfectNumber;

import java.util.Scanner;

public class P3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int temp=num;
	int i=1;
	int sum=0;
	
	while(i<=(num/2))
	{
		
		if(num%i==0)
		{
			sum=sum+i;
			
		}
		i++;
	}
	System.out.println(sum);
}
}
