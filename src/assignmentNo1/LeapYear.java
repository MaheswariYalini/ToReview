package assignmentNo1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=scan.nextInt();
		scan.close();
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			{	System.out.println("Leap Year");}
			else
				{ System.out.println("Not a Leap Year");}
	}
}
