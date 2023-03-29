package Month;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Eneter the month number ");
int month=sc.nextInt();
// as we are giving input in the form of number 
//so we can go for switch statements
//Break is mandatory to come out of loop
switch(month)
{
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
	System.out.println("The number of days in this month is 31 days");
	break;
case 4:
case 6:
case 9:
case 11:
	System.out.println("The number of days in this month is 30 days");
	break;
case 2:
	System.out.println("The number of days in this month is 28/29 days");
	break;
	default:System.out.println("Entered month is invalid");
	
	}

	}
}
