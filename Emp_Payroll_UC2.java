public class Emp_Payroll_UC2{
		public static void main(String args[]){
				int is_Full_Time = 1;
				int Emp_Rate_Per_Hour = 20;
				int empHrs = 0;
				int empWage = 0;
				double empCheck = Math.floor(Math.random() * 10) %2;
				if(empCheck == is_Full_Time)
						empHrs = 8;
				empWage = empHrs * Emp_Rate_Per_Hour;
				System.out.println("Emp Wage: " + empWage);
		}
}

