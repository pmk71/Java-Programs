package Even_Odd;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
//using conditional operator
System.out.println((num%2==0)? num+",is even":num+",is odd");

	}

}
