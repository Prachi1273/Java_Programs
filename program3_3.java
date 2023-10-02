import java.util.*;

class Accept
{
	public void Display(char ch)
	{
		if(ch>='A' && ch<='Z')
		{
			ch = (char)(ch + 32);
			System.out.println(ch);
		}
		else if(ch>='a' && ch<='z')
		{
			ch = (char)(ch - 32);
			System.out.println(ch);
		}
	}
}

class Display extends Accept
{
	public Display()
	{
		System.out.println("Conversion is : ");
	}
}

class program3_3
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter character : ");
		char ch = sobj.next().charAt(0);
		
		Accept aobj = new Display();
		
		aobj.Display(ch);
		
	}
}
