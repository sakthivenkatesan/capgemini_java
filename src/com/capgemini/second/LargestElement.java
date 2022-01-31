package com.capgemini.second;

import java.util.Scanner;

public class LargestElement 
{
	public static void main(String [] args)
	{
		int [] a = new int[10];
		int m=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10;i++)
			a[i] = sc.nextInt();
		for(int i=0; i<10;i++)
		{
			if(a[i] > m)
				m=a[i];
		}
		System.out.println("Largest number =" + m);
	}
}
