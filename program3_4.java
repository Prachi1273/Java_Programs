import java.util.*;

class Accept
{
	public boolean vowel(char ch)
	{
		if(ch=='a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u' || ch=='A' || ch == 'E' || ch == 'I' || ch=='O' || ch == 'U')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class program3_4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter character : ");
		char ch = sc.next().charAt(0);
		
		Accept obj = new Accept();
		
		boolean bret = obj.vowel(ch);
		if(bret == true)
		{
			System.out.println("It is Vowel");
		}
		else
		{
			System.out.println("It is NOT Vowel");
		}
		
	}
}
