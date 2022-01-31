package com.capgemini.second;

import java.util.Scanner;

public class ConcatenationOfArrays 
{
	public static void main(String [] args)
	{
		int [] a = new int[20];
		int [] b = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values for first array");
		for(int i=0; i<10;i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the values for second array");
		for(int i=0; i<10;i++)
			b[i] = sc.nextInt();
		for(int i=10; i<20; i++)
		{
			a[i] = b[i-10];
		}
		System.out.println("Concatenated Array = ");
		for(int i=0; i<20;i++)
			System.out.println(a[i]);
	}
}
