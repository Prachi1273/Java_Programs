import java.util.*;

class ans
{
	public void show(int row,int col)
	{	
		int j=0,i=0;
		
		for(i=1;i<=row;i++)
		{
			char ch = 'a';
			for(j=1;j<=col;j++)
			{
				if(i%2==0)
				{
					System.out.print(j+" ");
				}
				if(i%2!=0)
				{
					System.out.print(ch+" ");
					ch++;
				}
				
			}
			System.out.println();
		}
	}
}

class program21_3
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
