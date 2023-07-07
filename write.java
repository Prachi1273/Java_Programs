import java.io.*;

class write
{
    public static void main(String arg[]) throws IOException
    {
        FileOutputStream fobj = new FileOutputStream("Barve.txt");
        
        String  Data = "Prachi Anand Barve";
        
        byte bdata[] = Data.getBytes();
        
        fobj.write(bdata);
        fobj.close();
    }
}
