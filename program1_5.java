import java.util.*;

class Display
{
	public void Accept(int no)
	{
		for(int i=0;i<no;i++)
		{
			System.out.print("*  ");
		}
	}
}

class program1_5
{
	public static void main(String a[])
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = obj.nextInt();
		
		Display dobj = new Display();
		dobj.Accept(no);
	}
}
