import java.util.*;

class opt
{	
	public void show(int arr[])
	{
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		diff(min,max);
	}
	
	public void diff(int min, int max)
	{
		System.out.println("Smallest numbers is : "+min);
		System.out.println("Largest numbers is : "+max);
		System.out.println("Diffrence between Largest & Smallest numbers is : "+(max-min));
	}
}

class program17_3
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
		
		opt obj = new opt();
		obj.show(arr);
		
		
	}
}
