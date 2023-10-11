import java.util.*;

class ans
{
	public void show(int row,int col)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}

class program19_5
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of rows : ");
		int row = sobj.nextInt();
		
		System.out.println("Enter number of cols : ");
		int col = sobj.nextInt();
		
		ans obj = new ans();
		obj.show(row,col);
	}
}
