package Even_Odd;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		// using array index
		String[]n= {"even","odd"};
		
		System.out.println(n[num%2]);
	}

}
