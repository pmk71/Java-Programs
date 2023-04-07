package Date07_04_23;

public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		char ch='a';
		for (int i =1; i<=n; i++) {
			for(int j=1;j<=n;j++)
			{
				if((i==j))
					System.out.print(ch++ +" "); 
				else
					System.out.print("  ");
			}
			System.out.println();
	}

}
}
