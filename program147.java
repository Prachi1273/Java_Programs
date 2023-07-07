import java.util.*;

class Numbers 
{
	public void EvenFactorDisplay(int iNo)
    {
		int i =0;
		
		for(i=2;i<=(iNo/2);i+=2)//i = i+2
		{
			if((iNo%i)==0)
			{
					System.out.println("Even factor is :"+i);				
			}
		}
    }
}

class program147
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
