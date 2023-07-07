//abstract class is a class which contains 0 or more abstract methods in it 

abstract class Arithmetic
{
   public int Addition(int No1,int No2)
   {
      return No1 + No2;
   }
   public abstract int subtraction(int No1,int No2);
}

class Prachi extends Arithmetic
{
   public  int subtraction(int No1,int No2)
   {
       return No1 - No2;
   }
}



class Abstract
{
    public static void main(String arr[])
    {
        Prachi pobj = new Prachi();
        int ret = 0;
        ret = pobj.Addition(11,10);
        System.out.println("addition is "+ret);
        ret = pobj.subtraction(11,10);
        System.out.println("subtraction is "+ret);
    }
}
