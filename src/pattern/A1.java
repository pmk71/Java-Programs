package pattern;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=4;i++)
{
	int a=1;
	char ch='a';
	for(int j=1;j<=4;j++)
	{
		if(i==1||i==3)
		System.out.print(a++ +" ");
		else
			System.out.print(ch++ +" ");
		
	}
	System.out.println();
}
	}

}
