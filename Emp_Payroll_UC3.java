
public class Emp_Payroll_UC3 {
	
	public static void main(String args[])
	{
		int is_Part_Time=1;
		int is_Full_Time=2;
		int Emp_Rate_Per_Hour=20;
		int Emp_Hours=0;
		int EmpWage=0;
		double EmpCheck= Math.floor(Math.random() *10)%3;
		
		if(EmpCheck == is_Full_Time)
		{
			Emp_Hours=8;
		}
		else if(EmpCheck==is_Part_Time)
		{
			Emp_Hours=4;
			
		}
		EmpWage=Emp_Hours* Emp_Rate_Per_Hour;
		
		System.out.println("Emp Wage:"+EmpWage);
			
	}

}
