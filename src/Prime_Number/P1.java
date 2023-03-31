package Prime_Number;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int i=2;
		int count=0;

		// the number which can be divisible by 1 or by itself only ,than we say number is prime
		// any number can be divisible by 1 and itself but it should not get divisible completely by any other number also 
		// Example 7 {2,3,4,5,6}
		// when we split it half mark {2,3} because any number with range of its first half can only be complete divisible
		// we do this to increase the performance of software so that it will go for less iterations



		while(i<=(num/2))
		{
			if(num%i==0)
			{
				count++;
				break;
			}
			i++;
		}
		if (count==0)
			System.out.println("the number is prime");
		else
			System.out.println("the number is not a prime");

	}


}
