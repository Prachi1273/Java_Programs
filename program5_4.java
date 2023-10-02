import java.io.*;

class program5_4
{
	public static void main(String a[])
	{
		try
		{
			InputStreamReader iobj = new InputStreamReader(System.in);
			BufferedReader bobj = new BufferedReader(iobj);
			
			System.out.println("Enter number1 : ");
			int no1 = Integer.parseInt(bobj.readLine());
			
			System.out.println("Enter number2 : ");
			int no2 = Integer.parseInt(bobj.readLine());
			
			System.out.println("Enter number3 : ");
			int no3 = Integer.parseInt(bobj.readLine());
			
			int mult = 1;
			if(no1==0)
			{
				no1=1;	
			}
			if(no2==0)
			{
				no2=1;
			}
			if(no3==0)
			{
				no3=1;
			}
			mult = no1*no2*no3;
			System.out.println("Multiplication is : "+mult);
		}
		catch(IOException obj)
		{
			System.out.println("Exception occured");
			System.out.println(obj);
		}
			
	}
}
