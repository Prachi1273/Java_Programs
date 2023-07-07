import java.awt.*;

class PrachiFrame
{
   public PrachiFrame(String title) throws java.lang.UnsatisfiedLinkError
   {
      Frame fobj = new Frame(title);
      
      fobj.setSize(500,500);
      
      fobj.setVisible(true);
   }
}

class gui2
{
   public static void main(String a[])
   {
      PrachiFrame pobj = new PrachiFrame("Prachi PPA 41");
   }
}
