package day4;

import java.util.*;
public class ChangeTheCase 
{
	private static Scanner sc;

	public static void main(String[] args) 
	{
	 int i,l,k,b;
	 String s;
	 sc = new Scanner(System.in);
	 s=sc.nextLine();
	 l=s.length();
	 char c[]=s.toCharArray();
	 if((c[0]>='a')&&(c[0]<='z'))
	 {
	 b=c[0]-32;
	System.out.print((char)b);
	 }
	 else
	 {
		 System.out.print(c[0]);
	 }
	 for(i=1;i<l;i++)
	 {
		 
		 if(c[i-1]==' ')
		 {
			 if((c[i]>='a')&&(c[i]<='z'))
			 {
			k=c[i]-32;
			System.out.print((char)k);
			 }
			 else
			 {
				 System.out.print(c[i]);
			 }
		 }
		 else
		 {
			 System.out.print(c[i]);
		 }
	 }

	}

}
