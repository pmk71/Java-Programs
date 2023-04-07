package Assignment_05_04_2023;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p=1;
char ch='a';

for (int i = 1; i <=4; i++) {
	for(int j=1;j<=4;j++)
	{
		if(j%2==0)
			System.out.print(ch++ +" ");
		else
			System.out.print(p++ +" ");
	}
	System.out.println();
}

	}

}
