
import java.util.*;
public class Emp_Payroll_UC8 {
	
	int EmpWage;
	int NoOfWorkingDays;
	int WorkingHour;
	
	Scanner in=new Scanner(System.in);	
	
	public void SetEmp()
	{
		System.out.println("Enter Emp Wage");
		EmpWage=in.nextInt();
		System.out.println("Enter NoOfWorkingDays");
		NoOfWorkingDays=in.nextInt();
		System.out.println("Enter no of Working Hours");
		WorkingHour=in.nextInt();
	}
	
	public void show_EmpDetails()
	{
		System.out.println("Emp Wage:"+EmpWage);
		System.out.println("No of working days:"+NoOfWorkingDays);
		System.out.println("no of WorkingHour:"+WorkingHour);
	}
	

}

class MainProg{
	public static void main(String args[])
	{
		Emp_Payroll_UC8 e1=new Emp_Payroll_UC8();
		e1.SetEmp();
		e1.show_EmpDetails();
		
	}
}
