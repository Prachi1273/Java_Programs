import java.util.*;

class program331
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str = sobj.nextLine();
		
		char Arr[] = str.toCharArray();
		
		int Count = 0;
		int i =0;
		
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i] >='A' && Arr[i]<='Z')
			{
				Arr[i] = (char)(Arr[i] +32);
			}
		}
		String output = new String(Arr);
		
		System.out.println(output);
	}
}
