package employee;
public class Emp{
	String name;
	int id;
	String category;
	double basicPay,hra,da,netPay,pf,grossPay,incomeTax,allowance;
	public Emp(String name,int id,String category,double basicPay){
		this.name=name;
		this.id=id;
		this.category=category;
		this.basicPay=basicPay;
	}
	public void calSal(){
		hra=0.10*basicPay;
		da=0.05*basicPay;
		allowance=0.08*basicPay;
		pf=0.12*basicPay;
		grossPay=basicPay+hra+da+allowance;
		incomeTax=0.10*grossPay;
		netPay=grossPay-(pf+incomeTax);
	}
	public void dispSal(){
		System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: Rs." + basicPay);
		System.out.println("HRA is:- "+hra);
		System.out.println("DA is:- "+da);
		System.out.println("Allowance is:- "+ allowance);
		System.out.println("Providend Fund:- "+pf);
		System.out.println("Gross Salary:- "+grossPay);
		System.out.println("Income Tax:- "+incomeTax);
		System.out.println("Net Pay:-"+netPay);
	}
}