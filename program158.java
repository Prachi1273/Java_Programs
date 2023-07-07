import java.util.*;

class program158
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter full name : ");
		String str = sobj.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}
}
