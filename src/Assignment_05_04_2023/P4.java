package Assignment_05_04_2023;

public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='$';
		char ch1='*';
		for (int i = 1; i <=4; i++) {
			for(int j=1;j<=4;j++)
			{
				if(i%2==0)
				System.out.print(ch1 +" ");
				else
					System.out.print(ch +" ");
					
				
			}
			System.out.println();
		}

	}

}
