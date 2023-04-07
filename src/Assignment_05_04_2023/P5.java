package Assignment_05_04_2023;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <=5; i++) {
			char ch='$';
			int num=1;
			char ch1='a';
			for(int j=1;j<=4;j++)
			{
				if(i%2==0)
				{
				System.out.print(num +" ");
				num++;
				}
				else if(i==3)
					System.out.print(ch +" ");
				else
				{
					System.out.print(ch1+" ");
					ch1++;
				}
				
			}
			System.out.println();
		}
	}

}
