import java.util.*;

class Ans
{
	public int Display(int ele[])
	{
		int icnt = 0;
		for(int i : ele)
		{
			if(i==11)
			{
				icnt++;
			}
			
		}
		return icnt;
	}
}

class program15_4
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
		int output = obj.Display(Arr);
		
		System.out.println("11 is Present at "+output+" times");
		
	}
}
