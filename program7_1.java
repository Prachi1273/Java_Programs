import java.io.*;

class output
{
	public void Display(int ino)
	{
		if(ino<50)
		{
			System.out.println("Small");
		}
		else if(ino>50 && ino<100)
		{
			System.out.println("Medium");
		}
		if(ino>100)
		{
			System.out.println("Large");
		}
	}
}

class program7_1
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter number : ");
			int ino = Integer.parseInt(bobj.readLine());
			
			output obj = new output();
			obj.Display(ino);
		}
		catch(IOException obj)
		{}
	}
}
