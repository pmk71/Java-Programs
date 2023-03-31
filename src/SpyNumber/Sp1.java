package SpyNumber;
// WAJP to check the given number is spy number or not
import java.util.Scanner;

public class Sp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int sum=0;
		int pr=1;

		// if sum of digit of number is equal to product of digits than the number is said to be neon number
		// ie 1124  sum=1+1+2+4=8 product=1*1*2*4=8
		//8=8
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			pr=pr*rem;
			num=num/10;
		}

		if (sum==pr)
			System.out.println("the number is spy number");
		else
			System.out.println("the number is not a spy number");
	}

}
