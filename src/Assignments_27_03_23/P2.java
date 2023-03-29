package Assignments_27_03_23;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// considering total marks for subject as 100
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 4 subject marks of the student ");
		
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		
		System.out.println("Enter the passing marks criteria");
		int pass=sc.nextInt();
		int per=(s1+s2+s3+s4)/4;

		if(s1<pass||s2<pass||s3<pass||s4<pass)
			System.out.println("the student has failed in exam");
		else
		{
			if(per>=85)
				System.out.println("Distinction");
			else if(per>60)
				System.out.println("First class");
			else
				System.out.println("Second class");
			
		}
	}

}
