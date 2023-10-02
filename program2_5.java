import java.util.*;
import Num.evenodd;

class program2_5
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		evenodd eobj = new evenodd();
		
		boolean bret = eobj.chk(no);
		
		if(bret == true)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
	}
}
