package week1.day2.Assignments3;

public class CharOccurance 
{
	public static void main(String[] args) 
	{
		char search='e';
		String str="welcome to chennai";
		int count =0;
		char[] string=str.toCharArray();		// string to char array
		for(int i=0;i<str.length();i++)
		{
		
			if(search == string[i])				
			{
				count++;						// count value is incremented 
			}
		}
		System.out.println("The Character "+search+" is occurance "+count+" times");
	}
}
