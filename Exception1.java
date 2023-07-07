import java.util.*;

class Exception1
{
  public static void main(String a[])
  {
     Scanner sobj = new Scanner(System.in);
     int Arr[]={10,20,30,40};
     
     System.out.println("Enter inedex of array :");
     int i = sobj.nextInt();
     
     System.out.println("Data at specified index is :"+Arr[i]);
   }  
} 
