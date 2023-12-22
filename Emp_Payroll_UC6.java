
public class Emp_Payroll_UC6 {
	public static final int is_Part_Time=1;
	public static final int is_Full_Time=2;
	public static final int Emp_Rate_Per_Hour=20;
	public static final int Num_Of_Working_Days=2;
	public static final int Max_Hrs_Ina_Month=10;
	private static final int EmpCheck = 0;
	
	public static void main(String args[])
	{
		int EmpWage=0, totalEmpWage=0,totalworkindays=0,totalEmpHrs=0;
		while(totalEmpHrs<= Max_Hrs_Ina_Month && Num_Of_Working_Days <Num_Of_Working_Days)
		{
			int EmpHrs=0;
			totalworkindays++;
			int EmpCheck =(int) Math.floor(Math.random()*10) %3;
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
			totalEmpHrs+=EmpHrs;
			EmpWage=EmpHrs*Emp_Rate_Per_Hour;
			totalEmpWage+=EmpWage;
			System.out.println("Emp Wage:"+EmpWage);
		}
		System.out.println("Toal_Emp Wage:"+totalEmpWage);
		}
	
	
	
	}

	
	
	


