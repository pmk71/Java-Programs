package Date07_04_23;

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a=1;
		char ch='a';
		
		for (int i =1; i<=n; i++) {
			for(int j=1;j<=n;j++)
			{
				if(j%2==0)
					System.out.print(ch+" ");
				else
					System.out.print(a+" ");
			}
			System.out.println();
			a++;
			ch++;
		}
	}
}
