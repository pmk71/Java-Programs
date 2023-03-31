package Power_of_number;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base value");
		int b=sc.nextInt();
		System.out.println("enter power value");
		int p=sc.nextInt();
		int res=1;
		while(p>0)
		{
			res=res*b;
			p--;
		}
		System.out.println(res);

	}

}
