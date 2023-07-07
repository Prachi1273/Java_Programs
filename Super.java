class Base
{
    public int A,B;
    public Base(int No1,int No2)
    {
       this.A = No1;
       this.B = No2;
    }
    public void fun()
    {
       System.out.println("Base fun");
       System.out.println("value of a from fun is :"+this.A);
    }
}

class Derived extends Base
{
   public int X,Y;
   public Derived(int i,int j,int k,int l)
   {
      super(k,l);
      this.X = i;
      this.Y = j;
   }
    public void fun()
    {
       System.out.println("Derived gun");
       System.out.println("value of a from gun is :"+super.A);
       super.fun();
    }
}
 
class Super
{
   public static void main(String a[])
   {
       Derived dobj = new Derived(11,21,51,101);
       dobj.fun();
   }
}
