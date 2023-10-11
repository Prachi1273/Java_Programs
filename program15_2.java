import java.util.*;

class Ans
{
	public void Display(int ele[])
	{
		int icnt = 0,cnt=0;
		for(int i : ele)
		{
			if(i%2==0)
			{
				icnt++;
			}
			else
			{
				cnt++;
			}
		}
		Freq(icnt,cnt);
	}
	
	public void Freq(int even,int odd)
	{
		System.out.println("Frequency of even numbers in array are  : "+even);
		System.out.println("Frequency of odd numbers in array are  : "+odd);
		System.out.println("Diffrence between Frequency of even & odd numbers in array are  : "+(even-odd));
	}
}

class program15_2
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
