package Date07_04_23;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		
		for (int i =1; i<=n; i++) {
			for(int j=1;j<=n+1;j++)
			{
				if((i+j)%2==0)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
			}
			System.out.println();
			
		}
	}

}
