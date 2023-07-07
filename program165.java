import java.util.*;

class pasX
{
	public int CapsCount(String s)
	{
		int icnt =0;
		char Arr[] = s.toCharArray();
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]>='A'&& Arr[i]<='Z')
			{
				icnt++;
			}
		}
		return icnt;
	}
}

class program165
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
