import java.util.*;

class Ans
{
	public int Display(int ele[], int no)
	{
		int icnt = 0;
		
		while(ele[icnt]!=no)
		{
			icnt++;
		}
		return icnt;
	}
}

class program16_2
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
		
		System.out.println("Enter one number : ");
		int no = sobj.nextInt(); 
		
		Ans obj = new Ans();
		int output = obj.Display(Arr,no);
		
		System.out.println(no+" is first occured at "+output+" index");
		
	}
}
