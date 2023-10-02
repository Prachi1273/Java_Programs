import java.io.*;

class show
{
	public void Demo(int no1,int no2)
	{
		if(no1==no2)
		{
			System.out.println("Numbers are Equal");
		}
		else
		{
			System.out.println("Numbers are Not Equal");
		}
	}
}

class program5_3
{
	public static void main(String a[])
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		try
		{
			System.out.println("Enter First Number : ");
			int no1 = Integer.parseInt(bobj.readLine());
			
			System.out.println("Enter Second Number : ");
			int no2 = Integer.parseInt(bobj.readLine());
			
			show s = new show();
			s.Demo(no1,no2);
		}
		
		catch(IOException obj)
		{
			System.out.println("Exception occured ");
			System.out.println(obj);
		}
		
		
	}
}
