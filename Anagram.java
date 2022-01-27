package week1.day2.Assignments3;

import java.util.Arrays;

public class Anagram 
{
	public static void main(String[] args) 
	{
		String text1="stops",text2="potss";
		int txtLen1,txtLen2;
		txtLen1=text1.length();
		txtLen2=text2.length();
		if(txtLen1==txtLen2)						
		{
			char[] string1=text1.toCharArray(); 		// string to character
			char[] string2=text2.toCharArray();
			Arrays.sort(string1);						// arrays are sorting
			System.out.println("string 1 is ");			// just for reference
			System.out.println(string1);
			Arrays.sort(string2);
			System.out.println("string 2 is ");
			System.out.println(string2);
			if (Arrays.equals(string1,string2))			// to arrays are equal or not
			{
				System.out.println("The string is anagaram");
			}
			else
			{
				System.out.println("The string is not a anagram");
			}
		}
		else
		{
			System.out.println("The string is not Anagram");
		}
	}
}
