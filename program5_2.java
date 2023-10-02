import java.util.*;
import java.io.*;
import java.lang.*;

class Hundred
{
	public boolean Display(int val)
	{
		if(val>100)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class program5_2
{
	public static void main(String a[]) throws Exception
	{
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter number : ");
		int no = Integer.parseInt(bobj.readLine());
		
		Hundred hobj = new Hundred();
		boolean b = hobj.Display(no);
		
		if(b==true)
		{
			System.out.println("Greater");
		}
		else
		{
			System.out.println("Smaller");
		}
	}
}
