import java.util.*;

class Numbers 
{
	public void EvenFactorDisplay(int iNo)
    {
		int i =0;
		
		for(i=1;i<=(iNo/2);i++)
		{
			if((iNo%i)==0)
			{
				if(i%2 == 0)
				{
					System.out.println("Even factor is :"+i);
				}
			}
		}
    }
}

class program146
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		int iNo =0;
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
		
		Numbers nobj = new Numbers();
		
		nobj.EvenFactorDisplay(iNo);

	}
}
