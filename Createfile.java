import java.io.*;

class Createfile
{
    public static void main(String arg[]) throws IOException
    {
        File fobj = new File("Barve.txt");

        if(fobj.createNewFile())
        {
            System.out.println("File created succesfully");
        }
        else
        {
            System.out.println("Unable to create the file");
        }
    }
}
