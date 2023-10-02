import java.io.*;

class output
{
	public void Display(int ino)
	{
		int mult = 1;
		if(ino<0)
		{
			ino = -ino;
		}
		
		for(int i = 10;i>=1;i--)
		{
			System.out.println(ino*i);
		}

	}
}

class program7_5
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
