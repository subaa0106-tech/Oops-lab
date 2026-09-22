import java.io.*;
import java.lang.*;
import java.util.*;
class Employee
{
   string emp_name;
   int emp_id;
   string address;
   string mail_id;
   string mob_number; 
   Employee(string emp_name,int emp_id,string address,string mail_id,string
   mob_number)
  {
    this.emp_name = emp_name;
    this.emp_id = emp_id;
    this.address = address;
    this.mob_number = mob_number;
  }
  void display()
  {
     system.out.println( "Employee Name:"+ emp_name);
     system.out.println( "Employe_ID:"+ emp_id);
     system.out.println( "Address:"+ address);
     system.out.println( "Mobile Number:"+ mob_number);
  }
}
class Programmer extends Employee
{
   double basicPay,da,hra,pf,fund,netsalary,grosssalary;
   Programmer(string emp_name,int emp_id,string address,string mail_id,String
   mob_number,double bp)
   {
       super(emp_name,emp_id,address,mail_id,mob_number);
       basicpay = bp;
   }
   public void getPaySlip()
   {
      da=basicpay*97/100;
      hra=basicpay*10/100;
      pf=basicpay*12/100;
      fund=basicpay*0.1/100;
      grosssalary=basicpay+da+hra+pf+fund;
      netsalary = grosssalary-pf-fund;
   }
   void disp()
   {
      system.out.println("Name of The Employee:"+emp_name+"***** payslip*****");
      display();
      system.out.println("Grosssalary ="+ grosssalary);
      system.out.prntln("Netsalary ="+netsalary);
   }
}
class AssistantProfessor extends Empliyee
{
     double basicpay,da,hra,pf,fund,netsalary,grosssalary;
     AssistantProfessor (String emp_name,int emp_id,string address,string mail_id,String
     mob_number,double bp)
   {
     super(emp_name, emp_id, address,mail_id,mob_number);
     basicpay = bp;
   }
    public void getPaySlip()
   {
      da=basicpay*97/100;
      hra=basicpay*10/100;
      pf=basicpay*12/100;
      fund=basicpay*0.1/100;
      grosssalary=basicpay+da+hra+pf+fund;
      netsalary = grosssalary-pf-fund;
   }
   void disp()
   {
      system.out.println("Name of The Employee:"+emp_name+"***** payslip*****");
      display();
system.out.println("Grosssalary ="+ grosssalary);
      system.out.prntln("Netsalary ="+netsalary);
   }
}
class AssociateProfessor extends Empliyee
{
     double basicpay,da,hra,pf,fund,netsalary,grosssalary;
     AssistantProfessor (String emp_name,int emp_id,string address,string mail_id,String
     mob_number,double bp)
   {
     super(emp_name, emp_id, address,mail_id,mob_number);
     basicpay = bp;
   }
    public void getPaySlip()
   {
      da=basicpay*97/100;
      hra=basicpay*10/100;
      pf=basicpay*12/100;
      fund=basicpay*0.1/100;
      grosssalary=basicpay+da+hra+pf+fund;
      netsalary = grosssalary-pf-fund;
   }
   void disp()
   {
      system.out.println("Name of The Employee:"+emp_name+"***** payslip*****");
      display();
system.out.println("Grosssalary ="+ grosssalary);
      system.out.prntln("Netsalary ="+netsalary);
   }
}
class Professor extends Empliyee
{
     double basicpay,da,hra,pf,fund,netsalary,grosssalary;
     Professor (String emp_name, int emp_id,string address,string mail_id,String
   mob_number,double bp)
   {
     super(emp_name, emp_id, address,mail_id,mob_number);
     basicpay = bp;
   }
    public void getPaySlip()
   {
      da=basicpay*97/100;
      hra=basicpay*10/100;
      pf=basicpay*12/100;
      fund=basicpay*0.1/100;
      grosssalary=basicpay+da+hra+pf+fund;
      netsalary = grosssalary-pf-fund;
   }
   void disp()
   {
      System.out.println();stem.out.println("Name of The Employee:"+emp_name+"***** payslip*****");
      display();
      System.out.println("Grosssalary ="+ grosssalary);
      System.out.prntln("Netsalary ="+netsalary);
   }
}
public class employeePayslip
{
  public static void main(String arg[])throws IOException
  {
    String name,add,mail,mob;
    int id,desg;
    double bp;
    DataInputStream in = new DataInputStream(system.in);
    System.out.println("Enter the Name of Employee :");
    name=in.readLine();
    System.out.println("Enter the ID of Employee :");
     id= Integer.valueof(in.readLine());
    System.out.println("Enter Address of Employee :");
    add=in.readLine();
    System.out.println("Enter the Mail ID of Employee :");
    mail=in.readLine();
    System.out.println("Enter the Mobile Number of Employee :");
    mob=in.readLine();
     System.out.println("Enter the Basicpay  :");
    bp=Double.valueOfin.readLine();
     System.out.println("Enter the Designation :");
     system.out.println(" 1.Programmer\n2. AssistantProfessor\n3.AssociateProfessor\n4.Professor\n5. Exit");
     desg= Integer.valueOf(in.readLine());
     switch(desg)
     {
     case 1: Programmer p=new Programmer(name,id,add,mail,mob,bp);
            p.getPaySlip ();
            p.disp();
            break;
    case 2: AssistantProfessor ap=new AssistantProfessor(name,id,add,mail,mob,bp);
            ap.getPaySlip ();
            ap.disp();break;
    case 3: AssociateProfessor assp=new AssociateProfessor(name,id,add,mail,mob,bp);
            assp.getPaySlip ();
            assp.disp();
            break;
    case 4: Professor assp=new AssociateProfessor(name,id,add,mail,mob,bp);
            assp.getPaySlip ();
            assp.disp();
            break;
    case 5: System.exit(0);
    default:Sytem.out.println("Invalid designation");
     }
   }
}
 
    
      
    
      
    
      
      
    
      
    
      
      
     
    