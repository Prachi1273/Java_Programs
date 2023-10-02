import java.io.*;

class output
{
	public int Display(int ino)
	{	
		return (ino*1000);
	}
}

class program9_3
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter distance : ");
			int ino = Integer.parseInt(bobj.readLine());
			
			output obj = new output();
			int Ans = obj.Display(ino);
			
			System.out.println("Distance in meter : "+Ans);
		}
		catch(Exception obj)
		{}
	}
}
