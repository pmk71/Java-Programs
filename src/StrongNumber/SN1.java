package StrongNumber;

import java.util.Scanner;

// WAJP to check the given number is Strong number or not
  //The sum of factorial of each digit is equal to number than we can say the number is Strong number


//To do so we’ll check if the sum of the factorial of each individual digit of the number is equal to the number itself or not.
//
//For a number to be a Strong Number, the sum of Factorial of each digit of the number must be equal to the number itself.
public class SN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
	
		
		while(num>0)
		{
			int rem=num%10;
			int fac=1;
			// here we can write rem>=1 also
			while(rem>0)
			{
				fac=fac*rem;
				rem--;
				
			}
			sum=sum+fac;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("the number is Strong number");
		else
			System.out.println("the number is not a Strong number");
	}

}
