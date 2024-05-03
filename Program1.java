class Program1 extends Thread
{
	public void run()
	{
		char c;
		for(c='A';c<='Z';c++)
		{
			System.out.println(""+c);
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{}
		}
	}
	
	public static void main(String a[])
	{
		Program1 p = new Program1();
		p.start();
	}
}
