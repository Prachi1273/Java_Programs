import java.util.*;
import maths.Number;

class program2_4
{
	public static void main(String arr[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int ino = sobj.nextInt();
		
		System.out.println("Enter frequency : ");
		int freq = sobj.nextInt();
		
		Number nobj = new Number();
		
		nobj.display(ino , freq);
	}
}
