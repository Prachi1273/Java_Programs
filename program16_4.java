import java.util.*;

class opt
{
	public void show(int arr[],int strt,int end)
	{
		System.out.println("Elements in range are : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=strt && arr[i]<=end)
			{
				System.out.println(arr[i]);
			}
		}
	}
}

class program16_4
{
	public static void main(String a[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no. of elements : ");
		int no = s.nextInt();
		
		int []arr = new int[no];
		
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter starting point : ");
		int strt = s.nextInt();
		
		System.out.println("Enter ending point : ");
		int end = s.nextInt();
		
		opt obj = new opt();
		obj.show(arr,strt,end);
	}
}
