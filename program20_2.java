import java.util.*;

class ans
{
	public void show(int row,int col)
	{	
		int j=0,i=0;
		char ch = '\0',c='\0';
		for(i=1;i<=row;i++)
		{
			for(j=0,ch='A',c='a';j<col;j++,ch++,c++)
			{
				if(i%2!=0)
				{
					System.out.print(ch+" ");
				}
				
				if(i%2==0)
				{
					System.out.print(c+" ");
				}
			}
			System.out.println();
		}
	}
}

class program20_2
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
