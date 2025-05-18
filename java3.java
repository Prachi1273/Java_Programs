import java.util.*;

class MarksoutofBound extends Exception
{
	MarksoutofBound(String str)
	{
		super(str);
	}
}

class java3
{
	public static void main(String arr[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Roll No. : ");
		int RollNo = sobj.nextInt();
		
		System.out.println("Enter Marks : ");
		int marks = sobj.nextInt();
		
		try
		{
			if(marks<0 || marks>100)
			{
				throw new MarksoutofBound("Invalid Marks");
			}
			else
			{
			   System.out.println("Marks are Valid");
			}
		}
		catch(MarksoutofBound obj)
		{
			System.out.println("Marks Out Of Bound Exception...");
		} 
	}
}
