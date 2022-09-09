package assignmentNo1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String Org="canyoureverse";
		String org;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		org=scan.nextLine();
		scan.close();
		String revStr="";
		for(int i=org.length()-1;i>=0;i--)
		{
		revStr=revStr+org.charAt(i);
		}
		System.out.println(revStr);
	//	if (org == revStr) { //this is not working check later
		if(org.equals(revStr)) {
			System.out.println("The given string is Palindrome");
			}
			else {
				System.out.println("The given string is not Palindrome");
				}
	}

}
