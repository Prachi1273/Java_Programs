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
	
	public boolean CheckPallindrome()
	{
		int iStart = 0,iEnd = Arr.length-1;
		boolean bflag = true;
		
		while(iStart<iEnd)
		{
			if(Arr[iStart]!=Arr[iEnd])
			{
				bflag = false;
				break;
			}
			iStart++;
			iEnd--;
	        }
	        return bflag;
	  }
}

class program155
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size of array that you want to create : ");
		
		int iSize = sobj.nextInt();
		
		pasX obj = new pasX(iSize);
		
		obj.Accept();
		
		obj.Display();
		
		boolean bret = obj.CheckPallindrome();
		if(bret == true)
		{
			System.out.println("Array is pallindrome ");
		} 
		else
		{
			System.out.println("Array is not pallindrome ");
		}
	}
}
