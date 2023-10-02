import java.io.*;

class output
{
	public double Display(double ino)
	{	
		double pi = 3.14;
		
		return (pi*ino*ino);
	}
}

class program9_1
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter radius : ");
			double ino = Double.parseDouble(bobj.readLine());
			
			output obj = new output();
			double Ans = obj.Display(ino);
			
			System.out.println("Area of Circle: "+Ans);
		}
		catch(Exception obj)
		{}
	}
}
