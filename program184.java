import java.util.*;

class pattern
{
	public void Display(int iNo)
	{
	int itemp = iNo;
	int temp = iNo;
	while( itemp!=0)
	{
		while(temp!=0)
		{
			int idgt  = temp%10;
			
			System.out.print(idgt+"\t");
			temp = temp/10;
		}
		temp=iNo;
		System.out.println();
		itemp = itemp/10;
	}
	}
}

class program184
{
	public static void main(String a[])
	{
		pattern pobj = new pattern();
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no  : ");
		int i = sobj.nextInt();
		
		pobj.Display(i);
	}
}
