import java.io.*;

class output
{
	public void Display(int ino)
	{
		if(ino<0)
		{
			ino = -ino;
		}

		if(ino ==0)
		{
			System.out.println("Zero");
		}
		else if(ino ==1)
		{
			System.out.println("One");
		}
		else if(ino ==2)
		{
			System.out.println("Two");
		}
		else if(ino ==3)
		{
			System.out.println("Three");	
		}
		else if(ino ==4)
		{
			System.out.println("Four");
		}
		else if(ino ==5)
		{
			System.out.println("Five");
		}
		else if(ino ==6)
		{
			System.out.println("Six");
		}
		else if(ino ==7)
		{
			System.out.println("seven");
		}
		else if(ino ==8)
		{
			System.out.println("Eight");
		}
		else if(ino ==9)
		{
			System.out.println("Nine");
		}
		else
		{
			System.out.println("inot single digit");
		}
	}
}

class program7_2
{
	public static void main(String a[])
	{
		try
		{
			BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
		
			System.out.println("Enter one Number : ");
			int iino = Integer.parseInt(bobj.readLine());
			
			output obj = new output();
			obj.Display(iino);
		}
		catch(Exception obj)
		{}
	}
}
