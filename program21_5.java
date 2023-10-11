import java.util.*;

class ans
{
	public void show(int row,int col)
	{	
		int j=0,i=0,cnt=0;
		
		for(i=1;i<=row;i++)
		{
			System.out.print(i+" ");
			for(j=1,cnt=1;j<=col;j++,cnt++)
			{
				if(j>i)
				{
					System.out.print(j+" ");
				}
				
			}
			System.out.println();
		}
	}
}

class program21_5
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
