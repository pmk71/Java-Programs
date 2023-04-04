package Fibonaciiseries;

public class F2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=15;
int n1=0;
int n2=1;
int sum=0;
while(num>0)
{
	System.out.println(n1);
	sum=n1+n2;
	n1=n2;
	n2=sum;
	num--;
}
}

}
