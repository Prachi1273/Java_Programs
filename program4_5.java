import java.util.*;

class Factors
{
	public int fact(int no)
	{
		int sum =0,sum1=0,sum2=0;
		for(int i=1;i<no;i++)
		{
			if(no%i!=0)
			{
				sum = sum + i;
				//System.out.println(i);
				
			}
			else if(no%i==0)
			{
				sum1 = sum1+i;
			}
		}
		
		sum2 = sum1-sum;
		return sum2;
	}
}

class program4_5
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		Factors fobj = new Factors();
		int ret = fobj.fact(no);
		

		System.out.println("diffrence betn Summation of all non factors and factors is : "+ret);
	}
}
