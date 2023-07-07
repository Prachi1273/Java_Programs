/*
   class Object
   {
      // code
   }
*/

class Base
{
   public int A,B;
   public Base()
   {
      System.out.println("Base Constructor");
      this.A = 10;
      this.B = 20;
   }
   public void Fun()    //defination
   {
       System.out.println("Base Fun");
   }
   public void gun()    //defination
   {
       System.out.println("Base gun");
   }
   public void Fun(int No)   //overloaded defination
   {
       System.out.println("Base Fun with one integer");
   }
}

class Derived extends Base  //class derived:public base
{
   public int X,Y;
   public Derived()
   {
      System.out.println("Derived Constructor");
      this.X = 30;
      this.Y = 40;
   }
   public void Sun()   //defination
   {
       System.out.println("Derived Sun");
   }
   public void gun()    //overrided defination
   {
       System.out.println("Derived gun");
   }
}

class Single
{
   public static void main(String arg[])
   {
     //  Base bobj1 = new Base();
  // Derived dobj1 = new Derived();
    Base bobj2 = new Derived();
   // Derived dobj2 = new Base();
   
   bobj2.Fun();
   bobj2.Fun(11);
   bobj2.gun();
   // bobj2.Sun();
   }
}
