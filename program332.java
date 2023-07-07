import java.util.*;

class program332
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter String : ");
		String str = sobj.nextLine();
		
		String Arr[] = str.split(" ");
		
		System.out.println("Number of words are : "+Arr.length);
	}
}
