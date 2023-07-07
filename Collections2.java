import java.util.*;

class Collections2
{
  public static void main(String a[])
  {
     LinkedList <String>lobj = new LinkedList<String>();
     
     lobj.add("Prachi");
     lobj.add("Sharada");
     lobj.add("Radha");
     lobj.add("Suvarna");
     lobj.add("Anand");
     
     System.out.println("Elements of linked list are :"+lobj);
     
     lobj.addFirst("Piyush");
     System.out.println("Elements of linked list are :"+lobj);
     
     lobj.addLast("Era");
     System.out.println("Elements of linked list are :"+lobj);
     
     Iterator iobj = lobj.iterator();
     System.out.println("Data using iterator is :");
     while(iobj.hasNext())
     {
       System.out.println(iobj.next());
     }
     
     if(lobj.contains("Anand"))
     {
        System.out.println("Anand is present ");
     }
     else
     {
        System.out.println("Anand is NOT present ");
     }
     
     lobj.remove(0);
     System.out.println("Elements of linked list are :"+lobj);
     
     lobj.remove();
     System.out.println("Elements of linked list are :"+lobj);
     
     System.out.println("Number of elements are :"+lobj.size());
     
     lobj.clear();
     System.out.println("Elements of linked list are :"+lobj);
  }
}
