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
				if(icnt==10)
				{
					icnt = 1;
				}
				System.out.print(icnt+"\t");
				icnt++;	
			}
			System.out.println();
		}
	}
}

class program175
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
