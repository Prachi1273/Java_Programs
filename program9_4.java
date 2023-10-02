import java.io.*;

class output
{
	public double Display(int ino)
	{	
		double fahr = (ino-32)*(5/9);
		return fahr;
	}
}

class program9_4
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter temp. in farhenheit : ");
			int ino = Integer.parseInt(bobj.readLine());
			
			output obj = new output();
			double Ans = obj.Display(ino);
			
			System.out.println("Temp. in celsius : "+Ans);
		}
		catch(Exception obj)
		{}
	}
}
