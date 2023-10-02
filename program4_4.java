import java.util.*;

class Factors
{
	public int fact(int no)
	{
		int sum =0;
		for(int i=1;i<no;i++)
		{
			if(no%i!=0)
			{
				sum = sum + i;
				//System.out.println(i);
				
			}
		}
		return sum;
	}
}

class program4_4
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		Factors fobj = new Factors();
		int ret = fobj.fact(no);
		

		System.out.println("Summation of all non factors is : "+ret);
	}
}
