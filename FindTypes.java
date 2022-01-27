package week1.day2.Assignments3;

public class FindTypes 
{
	public static void main(String[] args) 
	{
		String test="$$ Welcome to 2nd Class of Automation $$ ";
		int letter=0,space=0,num=0,specialChar=0;
		int length=test.length();
		char[] str=test.toCharArray();
		for(int i=0;i<length;i++)
		{
			if(Character.isLetter(str[i]))
			{
				letter++;
			}
			else if(Character.isDigit(str[i]))
			{
				num++;
			}
			else if(Character.isSpaceChar(str[i]))
			{
				space++;
			}
			else
			{
				specialChar++;
			}
		}
		System.out.println("The Letter are "+letter);
		System.out.println("The Special Characters are "+specialChar);
		System.out.println("The Numbers are "+num);
		System.out.println("The Spaces are "+space);
	}
}
