import java.util.*;

class ArrayX
{
	protected int Arr[];
	
	public ArrayX(int iSize)
	{
		Arr = new int[iSize];
	}
	
	protected void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter "+Arr.length +" elements : ");
		for(int i =0; i<Arr.length;i++)
		{
			System.out.println("Enter element no. : "+(i+1));
			Arr[i] = sobj.nextInt();
		}
	}
	
	protected void Display()
	{
		System.out.println("Elements of Array are :");
		
		for(int i =0;i<Arr.length;i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		
		System.out.println();
	}
}

class pasX extends ArrayX
{
	public pasX(int iSize)
	{
		super(iSize);
	}
	
	public void Reverse()
	{
		int iStart = 0,iEnd = Arr.length-1,itemp = 0;
		
		while(iStart<iEnd)
		{
			itemp = Arr[iStart];
			Arr[iStart] = Arr[iEnd];
			Arr[iEnd] = itemp;
			
			iStart++;
			iEnd--;
		}
	}
}

class program154
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size of array that you want to create : ");
		
		int iSize = sobj.nextInt();
		
		pasX obj = new pasX(iSize);
		
		obj.Accept();
		
		obj.Display();
		
		obj.Reverse();
		
		System.out.println("Array after reverse operation :");
		
		obj.Display();
	}
}
