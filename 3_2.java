import java.util.*;
class Patient
{
String name;
int age;
int oxylevel;
int HRCTreport;
patient(String name, int age, int oxylevel, int HRCTreport)
{
this.name = name;
this.age = age;
this.oxylevel = oxylevel;
this.HRCTreport = HRCTreport;
}
}
public class Main extends Exception
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("How many patient you want insert:");
int number = sc.nextInt();
patient[] ob = new patient[number];
for(int j=0; j<number; j++)
{
System.out.println("Enter Name ");
String name = sc.next();
System.out.println("Enter Age ");
int age = sc.nextInt();
System.out.println("Enter oxygen level");
int oxylevel = sc.nextInt();
System.out.println("Enter HRCT report");
int HRCTreport = sc.nextInt();
ob[j] = new patient(name, age, oxylevel, HRCTreport);
}

for(int j=0; j<number; j++)
{
if(ob[j].oxylevel < 95 && ob[j].HRCTreport > 10)
try
{

throw new NullPointerException("\n");
}
catch(Exception e)
{
System.out.println("Patient is Covid Positive(+) and Need to Hospitalized\

n");

}
else
{
System.out.println("name: "+ob[j].name);
System.out.println("age " + ob[j].age);
System.out.println("oxygen level " +ob[j].oxylevel);
System.out.println("HRCT report " + ob[j].HRCTreport);
System.out.println("\n");
}
}
}
}
