import java.util.*;

class Digit
{
	public int Display(int no)
	{
		int dig = 0,icnt=0;
		while(no!=0)
		{
			dig = no%10;
			
			if(dig%2==0)
			{
				icnt++;	
			}
			
			no = no/10;
			
		}
		return icnt;
	}
}

class program13_1
{
	public static void main(String q[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int iNo = sobj.nextInt();
		
		Digit dobj = new Digit();
		int Ans = dobj.Display(iNo);
		
		System.out.println("Number of Even Digits are  : "+Ans);
	}
}
