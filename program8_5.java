import java.io.*;

class output
{
	public int Display(int ino)
	{	
		int fact = 1,fact1=1;
		
		if(ino<0)
		{
			ino = -ino;
		}
		
		for(int i=1;i<=ino;i++)
		{
			if(i%2!=0)
			{
				fact = fact*i;
			}
			else if(i%2==0)
			{
				fact1 = fact1*i;
			}
		}
		int diff = fact1-fact;
		return diff;
	}
}

class program8_5
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter number : ");
			int ino = Integer.parseInt(bobj.readLine());
			
			output obj = new output();
			int Ans = obj.Display(ino);
			
			System.out.println("Diffrence between Even factorial and odd factorial: "+Ans);
		}
		catch(Exception obj)
		{}
	}
}
