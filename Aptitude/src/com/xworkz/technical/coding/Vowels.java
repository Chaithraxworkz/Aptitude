package com.xworkz.technical.coding;

public class Vowels {

	public static void main(String[] args)
	{
		String str="Method overloading";
		int vCount=0,cCount=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='u')
			{
				vCount++;
			}
			else
				if(str.charAt(i)>='a'&&str.charAt(i)<='z')
				{
					cCount++;
				}
			}
		System.out.println("Vowels-"+vCount);
		System.out.println("Consonents-"+cCount);
	}

}
