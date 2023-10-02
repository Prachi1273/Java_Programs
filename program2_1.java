import java.util.*;

class show
{
	public void Display(int val)
	{
		int i =0;
		while(i<val)
		{
			System.out.print("*  ");
			i++;
		}
	}
}

class program2_1
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		show obj = new show();
		obj.Display(no);
	}
}
