import java.util.*;

class pasX
{
	public void Display(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}
}

class program159
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = sobj.nextLine();
		
		pasX obj = new pasX();
		obj.Display(str);
	}
}
