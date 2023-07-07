interface circle 
{
   float pi = 3.14f;  ////public static final pi = 3.14
   
   float area(float radius);  ///public abstract float area(float radius)   (internally)
   float circumferrence(float radius);
}

class Prachi implements circle
{
   public float area(float radius)
    {
        return pi *radius * radius;
    }
   public float circumferrence(float radius)
    {
        return 2*pi*radius;
    }
}

class Interface
{
    public static void main(String arr[])
    {
       System.out.println("value of pi is"+circle.pi);
       //circle.pi = 7.12f;
       circle cobj = new Prachi();
       float ret = 0.0f;
       ret = cobj.area(10.5f);
       System.out.println("area "+ret);
       ret = cobj.circumferrence(10.5f);
       System.out.println("circumference "+ret);
    }
}
