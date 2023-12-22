
public class Emp_Payroll_UC4 {
	
	public static final int is_Part_Time=1;
	public static final int is_Full_Time=2;
	public static final int Emp_Rate_Per_Hour=20;
	
	public static void main(String args[])
	{
		int EmpHrs=0;
		int EmpWage=0;
		
		int EmpCheck= (int) Math.floor(Math.random()*10) %3;
		
		switch(EmpCheck)
		{
		case is_Full_Time:
			EmpHrs=8;
			break;
			
		case is_Part_Time:
			EmpHrs=4;
			break;
			
		default:
			EmpHrs=0;
		}
		EmpWage=EmpHrs*Emp_Rate_Per_Hour;
		System.out.println("EmpWage:"+EmpWage);
	}
}
