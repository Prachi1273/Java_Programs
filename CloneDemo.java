
class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;
    
    public Employee(int No,String str,int Value)
    {
        this.Eid = No;
        this.Name = str;
        this.Salary = Value;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}

class CloneDemo
{
   public static void main(String A[])
   {
      try
      {
      Employee eobj = new Employee(101,"Prachi",11000);
      Employee eobj2 = (Employee)eobj.clone();
      
      System.out.println("Name of first employee :"+eobj.Name);
      System.out.println("Name of second employee :"+eobj2.Name);
      
      System.out.println("Salary of first employee :"+eobj.Salary);
      System.out.println("Salary of Second employee :"+eobj2.Salary);
      eobj.Name ="Suvarna";
      System.out.println("Name of first employee :"+eobj.Name);
      System.out.println("Name of second employee :"+eobj2.Name);
      System.out.println("hashcode of first employee :"+eobj.hashCode());
      }
      catch(CloneNotSupportedException obj)
      {}
   }
   
}
