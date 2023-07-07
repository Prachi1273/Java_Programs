import java.util.*;

class pattern
{
	public void Display(int irow,int icol)
	{
		int icnt = 1;
		for(int i =1;i<=irow;i++)
		{
			for(int j= 1;j<=icol;j++)
			{
				System.out.print(icnt+"\t");	
			}
			System.out.println();
		}
	}
}

class program173
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
