import java.util.*;
import employee.Emp;

class main1
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter name of employee : ");
		String name = sobj.nextLine();
		
		System.out.println("Enter category of employee : ");
		String category = sobj.nextLine();
		
		System.out.println("Enter id of employee : ");
		int emp_id = sobj.nextInt();
		
		System.out.println("Enter Basic Pay of employee : ");
		double basic_pay = sobj.nextDouble();
		
		System.out.println("Enter allowance of employee : ");
		double allowance = sobj.nextDouble();
		
		Emp e1 = new Emp(name, emp_id, category, basic_pay, allowance);

        	e1.Display();
	}
}
