import java.util.*;

class Factors
{
	public int fact(int no)
	{
		int mult = 1;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				mult = mult * i;
				//System.out.println(i);
				
			}
		}
		return mult;
	}
}

class program4_1
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		Factors fobj = new Factors();
		int ret = fobj.fact(no);
		
		System.out.println("Multiplication of factors : "+ret);
		
	}
}
