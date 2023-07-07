import java.util.*;

class program327
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str = sobj.nextLine();
		
		char Arr[] = str.toCharArray();
		
		System.out.println(str.length());
		System.out.println(Arr.length);
		
		int Count = 0;
		
		for(char ch : Arr)
		{
			if(ch >='a' && ch <='z')
			{
				Count++;
			}
		}
		
		System.out.println("small characters : "+Count);
		
	}
}
