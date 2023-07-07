import java.util.*;

class program334
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		
		String str = sobj.nextLine();
		
		String data = str.replaceAll("\\s+"," ");
		
		String newstr = data.trim();
		
		String Arr[] = newstr.split(" ");
		
		System.out.println("Number of words are : "+Arr.length);
	}
}
