import java.util.Scanner;

class Divisibility
{
	public boolean byfive(int no)
	{
		if(no%5==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}

class program1_4
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		Divisibility dobj = new Divisibility();
		boolean ret = dobj.byfive(no);
		
		if(ret == true)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
