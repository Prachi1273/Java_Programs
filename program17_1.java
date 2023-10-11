import java.util.*;

class opt
{
	public int show(int arr[])
	{
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
}

class program17_1
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
		int Ans = obj.show(arr);
		
		System.out.println("Largest numbers is : "+Ans);
	}
}
