import java.util.*;

class Ans
{
	public void Display(int ele[])
	{
		System.out.println("Elements which are divisible by 3 & 5 are : ");
		for(int i : ele)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}

class program14_4
{
	public static void main(String w[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no. of elements : ");
		int size = sobj.nextInt();
		
		int Arr[] = new int[size];
		
		System.out.println("Enter elements : ");
				
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
		
		Ans obj = new Ans();
		obj.Display(Arr);
		
	}
}
