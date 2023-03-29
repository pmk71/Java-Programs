package Assignments_27_03_23;
// program to check leap year or not
import java.util.Scanner;

public class P1 {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the year ");
	int year=sc.nextInt();
	// condition to check the given year is leap year or not
	// leap year will be complete divisible by 4 && 
	//some year which are divisible by 4 but not leap year example 1700 & 1800 etc

	if ((year%4==0 && year%100!=0)|| (year%400==0))
	System.out.println(year+",is leap year");
	else
		System.out.println(year+",is not the leap year");
}
}
