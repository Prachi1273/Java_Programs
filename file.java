import java.io.FileReader;
import java.io.IOException;

class file {

    public static void main(String[] args) throws java.io.FileNotFoundException {
        try
        {
        	FileReader fileReader = new FileReader("7_2.java");
        int i;
        while ((i = fileReader.read()) != -1) {
            System.out.print( i);
        }
        fileReader.close();
        }
        catch(Exception c)
        {}
    }
}
