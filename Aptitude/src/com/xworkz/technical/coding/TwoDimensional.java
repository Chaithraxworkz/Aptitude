package com.xworkz.technical.coding;

public class TwoDimensional {

	public static void main(String[] args) 
	{
		String str="chaithra";
		String result="";
		char ch=' ';
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				ch=(char)(str.charAt(i));
			}
			result+=ch;
		}
		System.out.println(result);
	}

}
