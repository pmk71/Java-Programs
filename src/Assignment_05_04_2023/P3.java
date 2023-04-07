package Assignment_05_04_2023;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1;
		for (int i = 1; i <=4; i++) {
			for(int j=1;j<=4;j++)
			{
				System.out.print(num +" ");
				num=(num%9)+1;
			}
			System.out.println();
		}

	}

}
