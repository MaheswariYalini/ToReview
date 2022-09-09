package assignmentNo1;

import java.util.Scanner;

public class ReverseASentence {

	public static void main(String[] args) {
		
		String Sen;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Sentence");
		Sen=scan.nextLine();
		scan.close();
		String revSen="";
		String revword="";
		String fnword="";
		//String[] words=Sen.split("\\s"); // "\\s" regular expression for one or more spaces
		String[] words=Sen.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
		revSen=revSen+words[i]+" ";
			for(int j=revSen.length()-1;j>=0;j--)
			{
			revword=revword+revSen.charAt(j);
			}
			fnword=revword;
			revword="";
		}
		System.out.println("Reversed Sentence"+ " " + revSen);
		System.out.println(fnword);
	//	System.out.println(fnword);
	}

}
