import java.io.*;

class Display
{
	public void RangeD(int iVal1, int iVal2)
	{
		for(int i =iVal1;i<=iVal2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		} 
	}
}

class program11_2
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter Starting point : ");
			int iNo1 = Integer.parseInt(bobj.readLine());
			
			System.out.println("Enter ending point : ");
			int iNo2 = Integer.parseInt(bobj.readLine());
			
			System.out.println("=============");
			
			Display dobj = new Display();
			dobj.RangeD(iNo1,iNo2);
		}
		
		catch(IOException E)
		{}
	}
}
