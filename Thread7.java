import java.util.*;

class data
{
  public int Arr[];
  public data(int size)
  {
     Arr = new int[size];
  }
  
  protected void finalize()
  {
     Arr=null;
  }
  public void accept()
   {
       Scanner sobj = new Scanner(System.in);
       System.out.println("Enter numbers :");
       for(int i = 0;i<Arr.length;i++)
       {
          Arr[i] = sobj.nextInt();
       }
   }
}

class Demo extends Thread
{
   public data dobj;
   public Demo(data obj);
   {
       dobj = obj;
   }
   public void run();
   {
      for(int i=0;i<dobj.Arr.length;i++)
      {
         if(dobj.Arr[i] % 2 ==0)
         {
           Ststem.out.println("Even numbers are :"+dobj.Arr[i]);
         }
      }
   }
}

class Demo1 extends Thread
{
   public data dobj;
   public Demo1(data obj);
   {
       dobj = obj;
   }
   public void run();
   {
      for(int i=0;i<dobj.Arr.length;i++)
      {
         if(dobj.Arr[i] % 2 !=0)
         {
           Ststem.out.println("odd numbers are :"+dobj.Arr[i]);
         }
      }
   }
}

class Thread7 
{
   public static void main(String a[])  
   {
      data obj1 = new data(10);
      obj1.accept();
      Demo dobj1 = new Demo(obj1);
      Demo1 d1obj = new Demo1(obj1);
      
      Thread t1 = new Thread(dobj);
      Thread t2 = new Thread(d1obj);
      
      t1.start();
      t2.start();
      
      t1.join();
      t2.join(); 
   }
}
