import java.util.*;

class Digit
{
	public void Display(int no)
	{
		int dig = 0,sumE=0,sumO=0;
		while(no!=0)
		{
			dig = no%10;
			
			if(dig%2==0)
			{
				sumE=sumE+dig;	
			}
			else
			{
				sumO=sumO+dig;	
			}
			
			no = no/10;
			
		}
		System.out.println("Addition of Even Digits is : "+sumE);
		System.out.println("Addition of Odd Digits is : "+sumO);
		
		System.out.println("Difference between Summation of Even & Odd Digits is : "+(sumE-sumO));
	}
}

class program13_5
{
	public static void main(String q[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int iNo = sobj.nextInt();
		
		Digit dobj = new Digit();
		dobj.Display(iNo);
		
	}
}
