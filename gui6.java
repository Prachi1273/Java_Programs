import java.awt.*;
import java.awt.event.*;

class PrachiFrame
{
   public PrachiFrame(String title) throws java.lang.UnsatisfiedLinkError
   {
      Frame fobj = new Frame(title);
      
      fobj.setSize(500,500);
      
      fobj.setVisible(true);
      
      Button bobj = new Button("OK");
      fobj.add(bobj);
      
      fobj.addWindowListener(new PrachiListner());
   }
}

class PrachiListner extends WindowAdapter
{
  public void windowClosing(WindowEvent obj) 
  {
     System.exit(0);
  }
}

class gui6
{
   public static void main(String a[])
   {
      PrachiFrame pobj = new PrachiFrame("Prachi PPA 41");
   }
}
