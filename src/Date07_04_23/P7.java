package Date07_04_23;

public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int a=1;
		
		for (int i =1; i<=n; i++) {
			for(int j=1;j<=n+1;j++)
			{
				if(a==10)
					a=1;
				if(i==1||i==4||j==1||j==5)
					System.out.print(a++ +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
			
	}
}
	}


