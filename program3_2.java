import java.util.*;

class Factors
{
	public void Even(int val)
	{
		for(int i=1;i<val;i++)
		{
			if(val % i == 0)
			{
				if(i % 2 == 0)
				{
					System.out.println(i);
				}
			}
		}
	}
}

class program3_2
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int ino = sobj.nextInt();
		
		Factors fobj = new Factors();
		
		fobj.Even(ino);
	}
}
