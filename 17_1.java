import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
/*
<applet code="MyCalculator" width=300 height=300>
</applet>
*/
public class MyCalculator extends Applet implements ActionListener {
    int num1,num2,result;
    TextField T1;
    Button NumButtons[]=new Button[10];
    Button Add,Sub,Mul,Div,clear,EQ;
    char Operation;
    Panel nPanel,CPanel,SPanel;
    public void init() {
        nPanel=new Panel();
        T1=new TextField(30);
        nPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        nPanel.add(T1);
        CPanel=new Panel();
        CPanel.setBackground(Color.white);
        CPanel.setLayout(new GridLayout(5,5,3,3));
        for(int i=0;i<10;i++) {
                NumButtons[i]=new Button(""+i);
            } 
        Add=new Button("+");
        Sub=new Button("-");
        Mul=new Button("*");
        Div=new Button("/");
        clear=new Button("clear");
        EQ=new Button("=");
        T1.addActionListener(this);
        for(int i=0;i<10;i++) {
            CPanel.add(NumButtons[i]);
        }
        CPanel.add(Add);
        CPanel.add(Sub);
        CPanel.add(Mul);
        CPanel.add(Div);
        CPanel.add(EQ);
        SPanel=new Panel();
        SPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        SPanel.setBackground(Color.yellow);
        SPanel.add(clear);
        for(int i=0;i<10;i++) {
            NumButtons[i].addActionListener(this);
        }
        Add.addActionListener(this);
        Sub.addActionListener(this);
        Mul.addActionListener(this);
        Div.addActionListener(this);
        clear.addActionListener(this);
        EQ.addActionListener(this);
        this.setLayout(new BorderLayout());
        add(nPanel,BorderLayout.NORTH);
        add(CPanel,BorderLayout.CENTER);
        add(SPanel,BorderLayout.SOUTH);
    }
    public void actionPerformed(ActionEvent ae) {
        String str=ae.getActionCommand ();
        char ch=str.charAt(0);
        if(Character.isDigit(ch))
            T1.setText(T1.getText()+str);
        else
            if(str.equals("+")){
                num1=Integer.parseInt (T1.getText());
                Operation='+';
                T1.setText ("");
            }
            if(str.equals("-")){
                num1=Integer.parseInt(T1.getText());
                Operation='-';
                T1.setText("");
            }
            if(str.equals("*")){
                num1=Integer.parseInt(T1.getText());
                Operation='*';
                T1.setText("");
            }
            if(str.equals("/")){
                num1=Integer.parseInt(T1.getText());
                Operation='/';
                T1.setText("");
            }
            if(str.equals("%")){
                num1=Integer.parseInt(T1.getText());
                Operation='%';
                T1.setText("");
            }
            if(str.equals("=")) {
                num2=Integer.parseInt(T1.getText());
                switch(Operation)
                {
                    case '+':result=num1+num2;
                            break;
                    case '-':result=num1-num2;
                            break;
                    case '*':result=num1*num2;
                            break;
                    case '/':try {
                                result=num1/num2;
                            }
                            catch(ArithmeticException e) {
                                result=num2;
                                JOptionPane.showMessageDialog(this,"Divided by zero");
                            }
                            break;
                }
                T1.setText(""+result);
            }
            if(str.equals("clear")) {
                T1.setText("");
            }
        }
}
