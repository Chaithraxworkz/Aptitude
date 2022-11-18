package com.xworkz.technical.coding;

public class Patterns 
{

	public static void main(String[] args)
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			if(i==n)
			{
				System.out.println(" ");
			}
			for(int j=n-1;j>=i;j--)
			{
				System.out.println(i);
			}
			for(int k=1;k<=i;k++)
			{
				if(k==n)
				{
					System.out.println(i);
				}
				else
				{
					System.out.println(i);
				}
			}
			System.out.println(" ");
		}
	}

}
