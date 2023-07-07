import java.util.*;

class pattern
{
	public void Display(int iNo)
	{
		while(iNo!=0)
		{
			int idgt  = iNo%10;
			
			System.out.print(idgt+"\t");
			iNo = iNo/10;
		}
		System.out.println();
	}
}

class program183
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
