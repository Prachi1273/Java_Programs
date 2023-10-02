import java.util.*;

class Freq
{
	public void even(int no)
	{
		int i =1,icnt=0;
		for(i=1;icnt<no;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				icnt++;
			}
		}
		
	}
}

class program3_1
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter frequency : ");
		int value = sobj.nextInt();
		
		Freq fobj = new Freq();
		fobj.even(value);
	}
}
