package AmstrongNumber;

public class A2 {
// using for loop check the given number is Armstrong number or not
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=153;
int count=0;
int temp=num;
int sum=0;
int temp1=num;

for (;num>0;)
{
	num=num/10;
	count++;

}
for (;temp>0;)
{
int rem=temp%10;
int p=1;
for (int i=0;i<count;i++)
{
	p=p*rem;
}
	sum=sum+p;
	temp=temp/10;
}
System.out.println(sum);
System.out.println(count);

if(temp1==sum)
System.out.println("the number is Amstrong number");
else
	System.out.println("the number is not Amstrong number");
}

	}

