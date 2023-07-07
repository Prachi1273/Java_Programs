import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;

class PrachiFrame
{
   public PrachiFrame(String title) throws java.lang.UnsatisfiedLinkError
   {
      JFrame fobj = new JFrame(title);
      
      fobj.setSize(500,500);
      
      fobj.setVisible(true);
      
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

class gui5
{
   public static void main(String a[])
   {
      PrachiFrame pobj = new PrachiFrame("Prachi PPA 41");
   }
}
