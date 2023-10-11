import java.util.*;

class ans
{
	public void show(int no)
	{
		int i = 2,cnt=0;
		while(cnt!=no)
		{	
			if(i%2==0)
			{
				System.out.println(i);		
			}
			i+=2;
			
			cnt++;
		}
	}
}

class program18_5
{
	public static void main(String ar[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int no = sobj.nextInt();
		
		ans obj = new ans();
		obj.show(no);
	}
}
