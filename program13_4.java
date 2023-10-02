import java.util.*;

class Digit
{
	public int Display(int no)
	{
		int dig = 0,mult=1;
		while(no!=0)
		{
			dig = no%10;
			
			if(dig==0)
			{
				dig=1;
			}
			
			mult = mult*dig;
			
			no = no/10;
			
		}
		return mult;
	}
}

class program13_4
{
	public static void main(String q[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int iNo = sobj.nextInt();
		
		Digit dobj = new Digit();
		int Ans = dobj.Display(iNo);
		
		System.out.println("Multiplication of digits are  : "+Ans);
	}
}
