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
	
	public int Addition()
	{
		int iSum =0;
		for(int i =0;i<Arr.length;i++)
		{
			iSum = iSum + Arr[i];
		}
		return iSum;
	}
}

class program153
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size of array that you want to create : ");
		
		int iSize = sobj.nextInt();
		
		pasX obj = new pasX(iSize);
		
		obj.Accept();
		
		obj.Display();
		
		int iRet = obj.Addition();
		
		System.out.println("Addition of Elements is :"+iRet);
	}
}
