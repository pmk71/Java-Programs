package Fibonaciiseries;
// write a java program to
public class F1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int sum=0;
System.out.println(a);
System.out.println(b);

while(sum<=20)
{
	sum=a+b;
	System.out.println(sum);
	a=b;
	b=sum;
}
	}

}
