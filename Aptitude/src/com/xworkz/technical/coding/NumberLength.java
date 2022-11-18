package com.xworkz.technical.coding;

public class NumberLength 
{

	public static void main(String[] args) 
	{
		String name="Welcome to java";
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)!='')
			{
				count++;
			}
		}
		System.out.println("total count",+count);
	}

}
