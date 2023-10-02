import java.io.*;

class output
{
	public double Display(int feet)
	{	
		double meter = feet*0.0929;
		return meter;
	}
}

class program9_5
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter area in square feet : ");
			int ino = Integer.parseInt(bobj.readLine());
			
			output obj = new output();
			double Ans = obj.Display(ino);
			
			System.out.println("Area in Square Meter : "+Ans);
		}
		catch(Exception obj)
		{}
	}
}
