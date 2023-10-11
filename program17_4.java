import java.util.*;

class logic
{
	public void Digit(int ele[])
	{
		System.out.println("Three digit no. in array are : ");
		
		for(int i=0;i<ele.length;i++)
		{	
			dig(ele[i]);
		}
	}
	
	public void dig(int i)
	{
		int digi=0,icnt=0,no;
		no=i;
		
		while(i!=0)
		{
			digi=i%10;
			icnt++;
			if(icnt==3)
			{
				System.out.println(no);
			}
			
			if(icnt > 3)
			{
				break;
			}
			i=i/10;
		}
		
			
	}
}

class program17_4
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter no. of elements : ");
		int iNo = sobj.nextInt();
		
		int []Arr = new int[iNo];
		
		System.out.println("Enter Elements : ");
		
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		
		logic lobj = new logic();
		lobj.Digit(Arr);
	}
}
