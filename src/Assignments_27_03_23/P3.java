package Assignments_27_03_23;
// to check the number is special two digit number or not
import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the two digit number");
//int num=sc.nextInt();


for (int i=10;i<101;i++)
{
	int num=i;
	int firstdigit=num/10;
	int seconddigit=num%10;
int sum=firstdigit+seconddigit;
int product=firstdigit*seconddigit;
int res=sum+product;
if(num==res)
	System.out.println(res);
}
//System.out.println(num+"is special two digit number");
//else
//	System.out.println(num+ "is not special two digit number");

}
}