class Demo
{
  public int iNo1;
  public int iNo2;
  
  public Demo(int a,int b)
  {
    iNo1 = a;
    iNo2 = b;
  }
}

class Equals
{
  public static void main(String a[])
  {
    String s1 = "Hello";
    String s2 = "Hello";

      System.out.println("Hashcode of s1 : "+s1.hashCode());
      System.out.println("Hashcode of s2 : "+s2.hashCode());
    
    if(s1.equals(s2))
    {
       System.out.println("Objects are Same");
    }
    else
    {
      System.out.println("Objects are Different");
    }
    
    if(s1==s2)
    {
       System.out.println("Objects are Same");
    }
    else
    {
      System.out.println("Objects are Different");
    }
  }
}
