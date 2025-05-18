import java.util.*;
import employee.Emp;
class Assignment2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employee Name:-");
		String name=sc.nextLine();
		System.out.print("Enter Employee ID:-");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Employee Category:-");
		String categroy=sc.nextLine();
		System.out.print("Enter Basic Pay:-");
		double basicPay=sc.nextDouble();

		Emp e=new Emp(name,id,categroy,basicPay);
		e.calSal();
		System.out.println();
		System.out.println("Salary Details:- ");
		e.dispSal();
		sc.close();
	}
}