import java.io.*;

class output
{
	public void Display(int ino)
	{
		if(ino<0)
		{
			ino = -ino;
		}
		
		for(int i = 0;i<ino;i++)
		{
			System.out.print("* ");
		}
		for(int i = 0;i<ino;i++)
		{
			System.out.print("# ");
		}
		System.out.println();
	}
}

class program8_1
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter one Number : ");
			int ino = Integer.parseInt(bobj.readLine());
			
			output obj = new output();
			obj.Display(ino);
	
		}
		catch(Exception obj)
		{}
	}
}
