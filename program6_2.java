import java.util.*;

class output
{
	public void Display(int no)
	{
		for(int i=1;i<=no;i++)
		{
			System.out.print(i+" ");
		}
	}
}

class program6_2
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		output obj = new output();
		
		obj.Display(no);
		System.out.println();
	}
}
