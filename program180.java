import java.util.*;

class pattern
{
	public void Display(String str)
	{
		char arr[] = str.toCharArray();
		int i =0 ,j=0;
		
		for(i=0;i<str.length();i++)
		{
			for(j=0;j<str.length();j++)
			{
				System.out.println(str.charAt(j)+"\t");
			}
			System.out.println();
		}
	}
}

class program180
{
	public static void main(String a[])
	{
		pattern pobj = new pattern();
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String s = sobj.nextLine();
		
		pobj.Display(s);
	}
}
