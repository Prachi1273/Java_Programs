import java.io.*;

class read
{
    public static void main(String arg[]) throws IOException
    {
        FileInputStream fobj = new FileInputStream("Barve.txt");
        
        int i = 0;
        
        while((i=fobj.read()) != -1)
        {
          System.out.print((char)i);
        }
        System.out.println();
        fobj.close();
    }
}
