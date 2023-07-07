import java.util.*;

class pattern
{
	public void Display(String str)
	{
		char arr[] = str.toCharArray();
		int i =0 ,j=0;
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				System.out.println(arr[j]+"\t");
			}
			System.out.println();
		}
	}
}

class program179
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
