package guvi;

import java.util.Scanner;

public class IncreaselySorted {
	
		public static void main(String args[])throws Exception
		{
		int n,i;
		System.out.println("Enter the size of the array");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int ar[]=new int[n];
		for(i=0;i<n;i++)
		{
		System.out.println("give the inputs");
		ar[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
		if(ar[i]==i)
		System.out.println("The number"+ar[i]+"is equals to its index"+i);
		}
		}
}
