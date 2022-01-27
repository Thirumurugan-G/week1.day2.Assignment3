package week1.day2.Assignments3;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String orig="madam",rev="";		// to declare two string variables // rev is empty string
		int length=orig.length();		// stored length of the string into the integer variable length
		for(int i=length-1;i>=0;i--)	// reversely iterated the string
		{
			
			rev=rev+orig.charAt(i);		// stored reverse string into the rev
			System.out.print(rev+" ");  // printing just for reference
									
		}
		System.out.println(" \n");		// is also reference
		if(orig.equalsIgnoreCase(rev))  // to check original string and reverse are equal or not
		{
			System.out.println(orig+" is a palindrome");
		}
		else
		{
			System.out.println(orig+" is not a palindrome");
		}
	}
}
