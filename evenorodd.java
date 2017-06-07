
package evenorodd;
import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args)
	{
		int n;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the number");
		n = s.nextInt();
	
	if(n%2==0)
	{
System.out.println("it is even");
}
	else
	{
		System.out.println("it is odd");
	}
}
}
