import java.util.*;

class pattern
{
	public void Display(int irow,int icol)
	{
		int icnt = 0;
		for(int i =1;i<=irow;i++)
		{
			for(int j= 1;j<=icol;j++)
			{
				
				System.out.print((icnt%9)+1 +"\t");
				icnt++;	
			}
			System.out.println();
		}
	}
}

class program178
{
	public static void main(String a[])
	{
		pattern pobj = new pattern();
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no of rows : ");
		int i = sobj.nextInt();
		
		System.out.println("Enter no of columns: ");
		int j = sobj.nextInt();
		
		pobj.Display(i,j);
	}
}
