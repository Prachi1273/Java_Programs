import java.util.*;

class Factors
{
	public void fact(int no)
	{
		
		for(int i=1;i<no;i++)
		{
			if(no%i!=0)
			{
				//mult = mult * i;
				System.out.println(i);
				
			}
		}
		
	}
}

class program4_3
{
	public static void main(String A[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		Factors fobj = new Factors();
		fobj.fact(no);
		

		
	}
}
