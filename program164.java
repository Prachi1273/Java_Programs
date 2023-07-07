import java.util.*;

class program164
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter string : ");
		String str = sobj.nextLine();
		
		char Arr[] = str.toCharArray();
		
		for(int i=0;i<Arr.length;i++)
		{
		System.out.println(Arr[i]);
		}
	}
}
