import java.util.*;

class AgeInvalidException extends Exception
{
     AgeInvalidException(String str)
     {
        super(str);
     }
}

class userdefined 
{
   public static void main()
   {
      Scanner sobj = new Scanner(System.in);
      System.out.println("Enter your age :");
      int iAge = sobj.nextInt();
      
      try
      {
        if(iAge<15)
        {
          throw new AgeInvalidException("Your age is less than 15");
        }
        else
        {
           System.out.println("Your age is valid ");
        }
      }
      catch(AgeInvalidException obj)
      {
        System.out.println("obj");
      }
   }
}
