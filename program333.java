import java.util.*;

class program333
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str = sobj.nextLine();
		
		String newstr = str.trim();
		String Arr[] = newstr.split(" ");
		
		System.out.println("Number of words are : "+Arr.length);
	}
}
