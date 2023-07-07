import java.util.*;

interface Prachi
{
	public void BubbleSort();
	public void SelectionSort();
	public void InsertionSort();
}

class Sorting implements Prachi
{
	private int Arr[];
	
	public Sorting(int Size)
	{
		 Arr = new int[Size];
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the elements : ");
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}
	
	public void Display()
	{
		System.out.println("Elements of array are : ");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
	}
	
	public void InsertionSort()
	{}
	
	public void SelectionSort()
	{}
	
	public void BubbleSort()
	{}
}

class program303
{
	public static void main(String Arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size of Array : ");
		int Size = sobj.nextInt();
		
		Sorting obj = new Sorting(Size);
		obj.Accept();
		obj.Display();
	}
}
