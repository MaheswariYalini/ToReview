package assignmentNo1;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num=scan.nextInt();
		if (Num % 2 ==0) 
			{	System.out.println("Even Number");}
			else
				{ System.out.println("Odd Number");}
		

	}

}
