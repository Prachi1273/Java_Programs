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
		
		for(int i=1;i<=ino;i++)
		{
			if(i%2!=0)
			{
				fact = fact*i;
			}
		}
		return fact;
	}
}

class program8_4
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
			
			System.out.println("Even factorial : "+Ans);
		}
		catch(Exception obj)
		{}
	}
}
