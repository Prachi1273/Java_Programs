import java.io.*;

class output
{
	public int Display(int ino)
	{
		int fact = 1;
		if(ino<0)
		{
			ino = -ino;
		}
		
		for(int i = 1;i<=ino;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
}

class program7_3
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter one Number : ");
			int ino = Integer.parseInt(bobj.readLine());
			
			output obj = new output();
			int Ans = obj.Display(ino);
			
			System.out.println("Factorial of "+ino+" is : "+Ans);
		}
		catch(Exception obj)
		{}
	}
}
