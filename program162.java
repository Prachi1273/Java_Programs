import java.util.*;

class pasX
{
	public int DigitCount(String s)
	{
		int icnt =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				icnt++;
			}
		}
		return icnt;
	}
}

class program162
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = sobj.nextLine();
		
		pasX obj = new pasX();
		int iret = obj.DigitCount(str);
		System.out.println("number of digits are  "+iret);
	}
}
