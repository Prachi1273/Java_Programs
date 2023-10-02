import java.util.*;

class show
{
	public void display(int no)
	{
		if(no < 10)
		{
			System.out.println("Hello ");
		}
		else
		{
			System.out.println("Demo ");
		}
	}
}

class program2_3
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int val = sobj.nextInt();
		
		show obj = new show();
		
		obj.display(val);
	}
}
