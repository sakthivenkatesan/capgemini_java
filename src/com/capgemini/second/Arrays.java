package com.capgemini.second;
import java.util.*;
public class Arrays 
{
	public static void main(String [] args)
	{
		//Integer Array
		int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10;i++)
			a[i] = sc.nextInt();
		for(int i=0; i<10;i++)
			System.out.println(a[i]);
		
		//Decimal Array
		float [] b = new float[10];
		for(int i=0; i<10;i++)
			b[i] = sc.nextFloat();
		for(int i=0; i<10;i++)
			System.out.println(b[i]);
		
		//Boolean Array
		Boolean [] c = new Boolean[5];
		for(int i=0; i<5;i++)
			c[i] = sc.nextBoolean();
		for(int i=0; i<5;i++)
			System.out.println(c[i]);
		
		//String Array
		String [] d = new String[5];
		for(int i=0; i<5;i++)
			d[i] = sc.toString();
		for(int i=0; i<5;i++)
			System.out.println(d[i]);
	}
}
