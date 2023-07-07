
class StaticDemo
{
   static
   {
   System.out.println("Inside static block of static democlass which contains main");
   }
   public StaticDemo()
   {
       System.out.println("Inside constructor of static democlass");
       }
   public static void main(String arg[])
   {
      System.out.println("Inside main");
      System.out.println("Value of static No3 : "+Demo.No3);
      System.out.println("Value of static No4 : "+Demo.No4);
      Demo.Gun();
      
      Demo obj1 = new Demo();
       Demo obj2 = new Demo();
       
       obj1.Fun();
   }
}

class Demo
{
   public int No1;           //non static characteristics
   public int No2;           //non static characteristics 
   public static int No3;    //static chracteristics 
   public static int No4;    //static chracteristics
   
   static         //static block
   {
      System.out.println("Inside static block");
      No3 = 51;
      No4 = 101;
   }
   
   
   public Demo()      //constructor
   {
      System.out.println("Inside constructor");
      No1 = 11;
      No2 = 21;
   }
   public void Fun()    //non static method
   {
   //Non-ststic method can access non-static as well as static data
   //we can use this keyword
       System.out.println("Inside non static method fun");
        System.out.println("Value of static No1 : "+this.No1);
         System.out.println("Value of static No2 : "+this.No2);
          System.out.println("Value of static No3 : "+this.No3);
           System.out.println("Value of static No4 : "+this.No4);
   }
   public static void Gun()     //static method 
   {
   //static method can access only static data
   //we can't use this keyword
      System.out.println("Inside static method fun");
       // System.out.println("Value of static No1 : "+No1);
         //System.out.println("Value of static No2 : "+No2);
          System.out.println("Value of static No3 : "+No3);
           System.out.println("Value of static No4 : "+No4);
   }
}
