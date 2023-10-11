import java.util.*;

class ans
{
	public void show(int row,int col)
	{	
		int j=0,i=0;
		
		for(i=1;i<=row;i++)
		{
			for(j=1;j<=col;j++)
			{
				if(i==1 || j==1 || j==col ||  i==row)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("@ ");	
				}
			}	
			System.out.println();
		}
	}
}

class program22_4
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
