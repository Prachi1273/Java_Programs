package Assignment2.SY;

import java.io.BufferedReader;
import java.io.*;

public class SYClass {
 public int ct,mt,et;
 public void get() throws IOException{
 System.out.println("Enter marks of students for computer, maths and electronics subject out of 200 ");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 ct=Integer.parseInt(br.readLine());
 mt=Integer.parseInt(br.readLine());
 et=Integer.parseInt(br.readLine());
 } 
}

package Assignment2.TY;

import java.io.*;
public class TYClass {
 public int tm,pm;
 public void get() throws IOException{
 System.out.println("Enter the marks of the theory out of 400 and practicals out of 200: ");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 tm=Integer.parseInt(br.readLine());
 pm=Integer.parseInt(br.readLine());
 }

}

package Assignment2;
import Assignment2.SY.*;
import Assignment2.TY.*;
import java.io.*;
class StudentInfo{
 int rollno;
 String name,grade;
 public float gt,tyt,syt;
 public float per;
 public void get() throws IOException{
 System.out.println("Enter roll number and name of the student: ");
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 rollno=Integer.parseInt(br.readLine());
 name=br.readLine();
 }
 
}
public class StudentMarks {
 public static void main(String[] args) throws IOException{
 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the number of students:");
 int n=Integer.parseInt(br.readLine());
 SYClass sy[]=new SYClass[n];
 TYClass ty[]=new TYClass[n];
 StudentInfo si[]=new StudentInfo[n];
 for(int i=0;i<n;i++)
 {
 si[i]=new StudentInfo();
 sy[i]=new SYClass();
 ty[i]=new TYClass();
 
 si[i].get();
 sy[i].get();
 ty[i].get();
 
 si[i].syt=sy[i].ct+sy[i].et+sy[i].mt;
 si[i].tyt=ty[i].pm+ty[i].tm;
 si[i].gt=si[i].syt+si[i].tyt;
 si[i].per=(si[i].gt/1200)*100;
 
 if(si[i].per>=70) si[i].grade="A";
 else if(si[i].per>=60) si[i].grade="B";
 else if(si[i].per>=50) si[i].grade="C";
 else if(si[i].per>=40) si[i].grade="Pass";
 else si[i].grade="Fail";
 
 
 }
 System.out.println("Roll No\tName\tSyTotal\tTyTotal\tGrandTotal\tPercentage\tGrade");
 for(int i=0;i<n;i++)
 {
 System.out.println(si[i].rollno+"\t"+si[i].name+"\t"+si[i].syt+"\t"+si[i].tyt+"\t"+si[i].gt+"\t\t"+si[i].per+"\t\t"+si[i].grade);
 
 }
 }

}

