package SpyNumber;
// WAJP to create a method to check the given number is spy number or not
import java.util.Scanner;

public class Sp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		String res=isSpy(num);
		// print the result to get the output
		System.out.println(res);
}
	public static String isSpy(int num)
	{
		int sum=0;
		int prd=1;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			prd=prd*rem;
			num=num/10;
		}
		if(sum==prd)
			return "spy number";
		else
			return "not a spy number";
	}
}

