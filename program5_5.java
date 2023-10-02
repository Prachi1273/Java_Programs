import java.io.*;

class Percent
{
	public double Perc(int total,int marks)
	{
		double Per = (marks/total)*100;
		return Per;
	}
}

class program5_5
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter Total Marks : ");
			int Total = Integer.parseInt(bobj.readLine());
			
			System.out.println("Enter Marks Obtained : ");
			int Marks = Integer.parseInt(bobj.readLine());
			
			Percent pobj = new Percent();
			double Ans = pobj.Perc(Total,Marks);
			
			System.out.println("Percentage : "+Ans+"%");
		}
		catch(IOException obj)
		{}
		
	}
}
