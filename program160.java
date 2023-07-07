import java.util.*;

class pasX
{
	public int SmallCount(String s)
	{
		int icnt =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'&& s.charAt(i)<='z')
			{
				icnt++;
			}
		}
		return icnt;
	}
}

class program160
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = sobj.nextLine();
		
		pasX obj = new pasX();
		int iret = obj.SmallCount(str);
		System.out.println("number of small case letters are  "+iret);
	}
}
