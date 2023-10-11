import java.util.*;

class ans
{
	public void show(int no)
	{
		char ch = 'A';
		int i = 0;
		while(i<no)
		{
			System.out.println(ch);
			i++;
			ch++;
		}
	}
}

class program18_1
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
