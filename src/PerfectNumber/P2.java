package PerfectNumber;
//Write java program to check the give 
import java.util.Scanner;

public class P2 {

	public static String isPerfect(int num)
	{
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
		if(num==sum)
			return "Hi";
		else
			return "Bye";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		String res=isPerfect(num);
		System.out.println(res);
		
		if (res=="Hi")
			System.out.println("Number is perfect");
		else
			System.out.println("NUmber is not perfect");
	}

}
