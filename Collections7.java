import java.util.*;

class Collections7
{
    public static void main(String arg[])
    {
        Hashtable <String,Integer>hobj = new Hashtable<String,Integer>();
        
        hobj.put("PPA",18000);
        hobj.put("LB",17000);
        hobj.put("PYTHON",16500);
        hobj.put("LSP",21000);
        
       System.out.println(hobj.get("PYTHON"));
        Enumeration eobj = hobj.keys();
        
        while(eobj.hasMoreElements())
        {
           System.out.println("Value is "+eobj.nextElement());
        }
        
        hobj.remove("LB");
    }
}
