import java.util.*;

class ArrayX
{
	public int Arr[];
	
	public ArrayX(int iSize)
	{
		Arr = new int[iSize];
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter "+Arr.length +" elements : ");
		for(int i =0; i<Arr.length;i++)
		{
			System.out.println("Enter element no. : "+(i+1));
			Arr[i] = sobj.nextInt();
		}
	}
	
	public void Display()
	{
		System.out.println("Elements of Array are :");
		
		for(int i =0;i<Arr.length;i++)
		{
			System.out.print(Arr[i]+"\t");
		}
		
		System.out.println();
	}
}

class program152
{
	public static void main(String a[])
	{			
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size of array that you want to create : ");
		
		int iSize = sobj.nextInt();
		
		ArrayX obj = new ArrayX(iSize);
		
		obj.Accept();
		
		obj.Display();
	}
}
