import java.util.*;

class Arithmetic
{
	public int iValue1;
	public int iValue2;
	
	public Arithmetic(int i,int j)
	{
		iValue1 = i;
		iValue2 = j;
	}
	
	public int Addition()
	{
		int Sum = 0;
		Sum = iValue1+iValue2;
		return Sum;
	}
}

class program145
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		int iNo1 = 0,iNo2 = 0,iAns = 0;
		
		System.out.println("Enter First number : ");
		iNo1 = sobj.nextInt();
		
		System.out.println("Enter second number :");
		iNo2 = sobj.nextInt();
		
		Arithmetic aobj = new Arithmetic(iNo1,iNo2);
		
		iAns = aobj.Addition();
		
		System.out.println("Addition is : "+iAns);
	}
}
