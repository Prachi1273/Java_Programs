import java.util.*;

class Digit
{
	public boolean Display(int no)
	{
		int dig = 0,icnt=0;
		while(no!=0)
		{
			dig = no%10;
			
			if(dig==0)
			{
				icnt++;	
			}
			
			no = no/10;
			
		}
		if(icnt>=1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class program12_3
{
	public static void main(String q[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int iNo = sobj.nextInt();
		
		Digit dobj = new Digit();
		boolean Ans = dobj.Display(iNo);
		
		if(Ans==true)
		{
			System.out.println("Zero is present");
		}
		else
		{
			System.out.println("Zero is NOT present");
		}
	}
}
