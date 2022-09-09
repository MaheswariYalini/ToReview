package assignmentNo1;

import java.util.Scanner;

public class SquOrRect {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Width and Height");
		int height=scan.nextInt();
		int width=scan.nextInt();
		if (height == width) 
			{	System.out.println("It is a Square");}
			else
				{ System.out.println("It is a Rectangle");}
		}
	}

