package day4;

import java.util.*;
public class ArrayToArrayList {
	public static void main(String[] args)
	{
		int n,i; 
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	    sc.nextLine();
		String s[]=new String[n];
		for(i=0;i<n;i++)
		{
			 s[i]=sc.nextLine();
			 
		}
      List<String>a=Arrays.asList(s);
      System.out.print(a);
	}

}
