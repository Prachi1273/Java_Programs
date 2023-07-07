import java.util.*;

class Numbers 
{
	public void CommonFactorDisplay(int iNo1,int iNo2)
    {
		int i =0;
		System.out.println("Common factors are : ");
		for(i=1; i<=iNo1/2 && i<=iNo2/2;i++)
		{
		   if((iNo1%i==0) && (iNo2%i==0)) 
		   {
		    System.out.println(i);
		   }
		}
    }
}

class program148
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		int iNo1 =0;
		
		System.out.println("Enter the First number : ");
		iNo1 = sobj.nextInt();
		
		System.out.println("Enter the Second number : ");
		int iNo2 = sobj.nextInt();
		
		Numbers nobj = new Numbers();
		
		nobj.CommonFactorDisplay(iNo1,iNo2);

	}
}
