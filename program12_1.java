import java.util.*;

class Digit
{
	public void Display(int no)
	{
		int dig = 0;
		while(no!=0)
		{
			dig = no%10;
			no = no/10;
			System.out.println(dig);
		}
	}
}

class program12_1
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
