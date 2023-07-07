class Demo
{
   public int No1;
   public final int No2 = 11;
   public final int No3;
   
   public Demo()
   {
      No1 = 0;
      No3 = 21;
   }
}

class Final1
{
    public static void main(String arr[])
    {
        Demo dobj = new Demo();
        dobj.No1++;
        dobj.No2++;
        dobj.No3++;
    }
}
