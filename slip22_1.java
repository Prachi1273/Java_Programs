import java.io.*;
import java.sql.*;
class Menu
{
    public static void main(String args[])
    {
        DataInputStream din=new DataInputStream(System.in);
        int rno,k,ch,per;
        String nm;
        try        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection cn=DriverManager.getConnection("jdbc:odbc:BCA");
            Statement st=cn.createStatement();
            do            {
                System.out.println(" 1. Insert \n 2. Update \n 3. Delete \n 4. Search \n 5. Display \n 6. Exit");
                System.out.print("Enter your choice: ");
                ch=Integer.parseInt(din.readLine());
                System.out.println("............................................");
                switch(ch)
                {
                    case 1:
                        System.out.print("How many records you want to inserted ? ");
                        Int n=Integer.parseInt(din.readLine());
                        for(int i=0;i<n;i++)
                        {
                            System.out.println("Enter Roll No : ");
                            rno=Integer.parseInt(din.readLine());
                            System.out.println("Enter Name : ");
                            nm=din.readLine();
                            System.out.println("Enter Percentage: ");
                            per=Integer.parseInt(din.readLine());
                            18                            k=st.executeUpdate("insert into Stud values(" + rno + ",'"+ nm + "'," + per +")");
                            if(k>0)
                            {
                                System.out.println("Record Inserted Successfully..!!");
                                System.out.println("..............................................");
                            }
                        }
                        break;
                    case 2:
                        System.out.print("Enter the Roll no: ");
                        rno=Integer.parseInt(din.readLine());
                        System.out.print("Enter the Sname: ");
                        nm=din.readLine();
                        k=st.executeUpdate("update Stud set sname='" + nm + "' where rno="+rno);
                        if(k>0)
                        {
                            System.out.println("Record Is Updated..!!");
                        }
                        System.out.println("...............................................");
                        break;
                    case 3:
                        System.out.print("Enter the Roll no: ");
                        rno=Integer.parseInt(din.readLine());
                        k=st.executeUpdate("delete from Stud where rno=" +rno);
                        if(k>0)
                        {
                            System.out.println("Record Is Deleted..!!");
                        }
                        System.out.println(".............................................");
                        break;
                    case 4:
                        System.out.print("Enter the Roll no Whoes search record: ");
                        rno=Integer.parseInt(din.readLine());
                        System.out.println(".............................................");
                        ResultSet rs1=st.executeQuery("select * from Stud where rno=" +rno);
                        while(rs1.next())
                        {
                            System.out.println(rs1.getInt(1) +"\t" +rs1.getString(2)+"\t"+rs1.getInt(3));
                        }
                        19                        System.out.println(".........................................");
                        break;
                    case 5:
                        ResultSet rs=st.executeQuery("select * from Stud");
                        while(rs.next())
                        {
                            System.out.println(rs.getInt(1) +"\t" +rs.getString(2)+"\t"+rs.getInt(3));
                        }
                        System.out.println(".............................................");
                        break;
                    case 6:
                        System.exit(0);
                }
            }
            while(ch!=6);
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
    }
}
