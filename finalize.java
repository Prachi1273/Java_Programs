class Demo
{
   public int Size ;
   public int Arr[];
   
   public Demo(int No)
   {
      System.out.println("Inside constructor");
      Size = No;
      Arr = new int[Size];
   }
   
   protected void finalize()
   {
      System.out.println("Inside finalize");
      Arr = null;
   }
}

class finalize
{
  public static void main(String a[])
  {
    Demo obj = new Demo(4);
    obj = null;
    System.gc();
  }
}

