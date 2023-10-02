import java.io.*;

class output
{
	public double Display(double w,double h)
	{			
		return (w*h);
	}
}

class program9_2
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter width: ");
			double w = Double.parseDouble(bobj.readLine());
			
			System.out.println("Enter height: ");
			double h = Double.parseDouble(bobj.readLine());
			
			output obj = new output();
			double Ans = obj.Display(w,h);
			
			System.out.println("Area of Rectangle : "+Ans);
		}
		catch(Exception obj)
		{}
	}
}
