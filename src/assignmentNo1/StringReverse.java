package assignmentNo1;

public class StringReverse {

	//Using Array
	public static void main(String[] args) {
		String input="LetsReverse";
		char[] myarr =input.toCharArray(); //String to Chararray
		int i;
		for(i=input.length()-1;i>=0;i--)
		{
		
		System.out.println(myarr[i]);
		}
		
		//Using No Array
		
		String Org="canyoureverse";
		String revStr="";
		//char ch;
		for(i=Org.length()-1;i>=0;i--)
		{
		revStr=revStr+Org.charAt(i);
		}
		System.out.println(revStr);
	}
}