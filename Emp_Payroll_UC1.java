
public class Emp_Payroll_UC1 {
	public static void main(String args[]){
		int is_Full_Time=1;
		double empCheck = Math.floor(Math.random() *10)%2;

		if(empCheck == is_Full_Time)
		{
				System.out.println("Employee is present");
		}
		else
		{
				System.out.println("Employee is Absent");
		}
}
}




