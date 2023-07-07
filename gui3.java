import java.awt.*;
import java.awt.event.*;

class PrachiFrame
{
   public PrachiFrame(String title) throws java.lang.UnsatisfiedLinkError
   {
      Frame fobj = new Frame(title);
      
      fobj.setSize(500,500);
      
      fobj.setVisible(true);
      
      fobj.addWindowListener(new PrachiListner());
   }
}

class PrachiListner implements WindowListener
{
  public void windowDeactivated(WindowEvent obj){}
  public void windowActivated(WindowEvent obj) {}
  public void windowDeiconified(WindowEvent obj) {}
  public void windowIconified(WindowEvent obj) {}
  public void windowClosed(WindowEvent obj) {}
  public void windowClosing(WindowEvent obj) 
  {
     System.exit(0);
  }
  public void windowOpened(WindowEvent obj){} 
}

class gui3
{
   public static void main(String a[])
   {
      PrachiFrame pobj = new PrachiFrame("Prachi PPA 41");
   }
}
