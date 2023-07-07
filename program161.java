import java.util.*;

class pasX
{
	public int CapsCount(String s)
	{
		int icnt =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A'&& s.charAt(i)<='Z')
			{
				icnt++;
			}
		}
		return icnt;
	}
}

class program161
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = sobj.nextLine();
		
		pasX obj = new pasX();
		int iret = obj.CapsCount(str);
		System.out.println("number of large case letters are  "+iret);
	}
}
