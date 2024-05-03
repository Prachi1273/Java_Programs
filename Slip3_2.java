import java.applet.*;
import java.awt.*;
class Slip3_2 extends Applet implements Runnable
{
Thread t;
int r,g1,y,i;
public void init()
{
T=new Thread(this);
t.start();
r=0; g1=0;I=0; y=0;
}
public void run()
{
try
{

for(I =24; I >=1;i--)
{
if (I >16&& I <=24)
{
t.sleep(200);
r=1;
repaint();
}
if (I >8&& I <=16)
{
t.sleep(200);
y=1;
repaint();
}
if(I >1&& I <=8)
{
t.sleep(200);
g1=1;
repaint();
}
}
if (I ==0)
{
run();
}
}
catch(Exception e)
{ System.out.println(e);
}
} public void paint(Graphics g)
{
g.drawRect(100,100,100,300);
if (r==1)
{
g.setColor(Color.red);
g.fillOval(100,100,100,100);
g.setColor(Color.black);
g.drawOval(100,200,100,100);
g.drawOval(100,300,100,100);
r=0;
}
if (y==1)
{
g.setColor(Color.black);
g.drawOval(100,100,100,100);
g.drawOval(100,300,100,100);
g.setColor(Color.yellow);
g.fillOval(100,200,100,100);

y=0;
}
if (g1==1)
{
g.setColor(Color.black);
g.drawOval(100,100,100,100);
g.drawOval(100,200,100,100);
g.setColor(Color.green);
g.fillOval(100,300,100,100);
g1=0;
}
}
}
