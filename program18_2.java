import java.util.*;

class ans
{
	public void show(int no)
	{
		int i = 0;
		for(i=no;i>0;i--)
		{
			System.out.print(i);
			System.out.print(" # ");
		}
	}
}

class program18_2
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		ans obj = new ans();
		obj.show(no);
	}
}
