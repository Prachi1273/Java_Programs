import java.io.*;

class Display
{
	public int RangeD(int iVal1, int iVal2)
	{
		int sum = 0;
		if(iVal1<0)
		{
			System.out.println("Invalid range");
			return -1;
		}
		for(int i =iVal1;i<=iVal2;i++)
		{
			sum = sum+i;
		}
		return sum; 
	}
}

class program11_3
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
			int Add = dobj.RangeD(iNo1,iNo2);
			
			System.out.println("Addition of numbers from "+iNo1+" to "+iNo2+" is : "+Add);
		}
		
		catch(IOException E)
		{}
	}
}
