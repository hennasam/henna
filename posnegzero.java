package posnegzero;
import java.util.Scanner;

public class posnegzero {
	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the integer");
		n = s.nextInt();
	
	{
	if(n>0)
	{
	System.out.println("given integer "+n+" positive");
}
else if(n<0)
{
	System.out.println("given integer "+n+" negative");
}
else
{
	System.out.println("given integer "+n+" zero");
}

}
}
}

