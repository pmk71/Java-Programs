package Date07_04_23;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=13;

for (int i =1; i<=n; i++) {
	for(int j=1;j<=n;j++)
	{
		if(i==1||i==n||j==1||j==n||i==j||i+j==n+1||i==(n/2)+1||j==(n/2)+1)
			System.out.print("* ");
		else
			System.out.print("  ");
	}
	System.out.println();
	
}
	}

}
