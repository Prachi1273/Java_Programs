import java.util.*;

class Ans
{
	public boolean Display(int ele[])
	{
		int icnt = 0;
		for(int i : ele)
		{
			if(i==11)
			{
				icnt++;
			}
			
		}
		if(icnt>=1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class program15_3
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
		boolean output = obj.Display(Arr);
		if(output==true)
		{
			System.out.println("11 is Present");
		}
		else
		{
			System.out.println("11 is NOT Present");
		}
	}
}
