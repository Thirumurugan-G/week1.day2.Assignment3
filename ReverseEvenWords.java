package week1.day2.Assignments3;

import java.util.Arrays;

public class ReverseEvenWords 
{
	public static void main(String[] args) 
	{
		String test="I am a software tester";
		String[] split=test.split(" ");
		System.out.println("The string after spliting \n"+Arrays.toString(split));
		for(int i=0;i<=split.length-1;i++)
		{
			if(i%2!=0)
			{
				char[] rev=split[i].toCharArray();				
				for(int j=rev.length-1;j>=0;j--)
				{
					System.out.print(rev[j]);
				}
				System.out.print(" ");
			}
			else
			{
				
				System.out.print(split[i]+" ");
			}
		}
	}
}