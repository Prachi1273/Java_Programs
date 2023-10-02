import java.io.*;

class output
{
	public int Display(int ino)
	{	
		return (ino*70);
	}
}

class program8_2
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter Amount in Us Dollar : ");
			int ino = Integer.parseInt(bobj.readLine());
			
			output obj = new output();
			int Rs = obj.Display(ino);
			
			System.out.println("Amount in Indian Currency : Rs"+Rs);
		}
		catch(Exception obj)
		{}
	}
}
