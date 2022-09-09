package assignmentNo1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int WNum = scan.nextInt();
		
		if (WNum<=0) 
		{System.out.println("Number should be greater than Zero");}
		
		else {
		int FNum=0,SNum=1,TNum;  
		System.out.print(FNum+" "+SNum); 
		for(int i=2;i<WNum;i++)
		 {  
		  TNum=FNum+SNum;  
		  System.out.print(" "+TNum);  
		  FNum=SNum;  
		  SNum=TNum;  
		 }  
		}
	}
}
