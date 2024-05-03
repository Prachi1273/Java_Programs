package sikshapath; //create your own package
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
class EmailId
{
    String domainID,username,password;
    EmailId()
    {
        domainID="K7";
        username="K";
        password="constructc000";
    }
    EmailId(String user,String pass,String domID)
    {
        domainID=domID;
        username=user;
        password=pass;
    }
    public static void main(String[] args) {
        String user,pass, domID;
        int p=-1,up=-1,u=-1,d=-1;
        EmailId obj=new EmailId();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter username: ");
        user=sc.nextLine();
        System.out.println("\nEnter password: ");
        pass=sc.nextLine();
        System.out.println("\nEnter Domain ID: ");
        domID=sc.nextLine();
        System.out.println("Enter a date in dd/mm/yyyy format :");
        String date = sc.next();
        EmailId obj1=new EmailId(user,pass,domID);
        if((obj.username).equals(obj1.username))
        {
            u=1;
            if(obj.password.equals(obj1.password))
            {
                up=1;
            }
            else
            {
                p=0;
            }
        }
        else
        {
            u=0;
        }
        if(dateValidation(date)==true)
            d=1;
        else
            d=0;
        if(d==1)
        {
            if(u==0)
            {
                try{
                    throw new InvalidUsernameException(user);
                }
                catch (Exception e) {
                    System.out.println(e) ;
                }
            }
            if (p==0){
                {
                    try{
                        throw new InvalidPasswordException(pass);
                    }
                    catch (Exception e) {
                        System.out.println(e) ;
                    }
                }
            }
            if(up==1)
            {
                System.out.println("Valid email id");
            }
        }
        else{
            System.out.println("Not a Valid email id");
        }
    }
    public static boolean dateValidation(String date)
    {
        boolean status = false;
        if (checkDate(date)) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(date);
                status = true;
            } catch (Exception e) {
                status = false;
            }
        }
        return status;
    }
    static boolean checkDate(String date) {
        String pattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
        boolean flag = false;
        if (date.matches(pattern)) {
            flag = true;
        }
        return flag;
    }
}
class InvalidUsernameException extends Exception{
    String num1;
    InvalidUsernameException(String num2) {
        num1=num2;
    }
    public String toString(){
        return ("exception in thread ‘main’ InvalidUsernameException: Username: "+ num1 + " doesn’t match") ;
    }
}
class InvalidPasswordException extends Exception{
    String num1;
    InvalidPasswordException(String num2) {
        num1=num2;
    }
    public String toString(){
        return ("exception in thread ‘main’ InvalidPasswordException: Username: "+ num1 + " doesn’t match") ;
    }
}
