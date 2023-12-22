
public class Emp_Payroll_UC7 {

	    // Class variables
	    private static final int HOURLY_RATE = 10;
	    private static final int MAX_HOURS = 40;

	    // Class method to compute employee wage
	    public static int computeEmployeeWage(int hoursWorked) {
	        int totalWage = 0;

	        if (hoursWorked <= MAX_HOURS) {
	            totalWage = hoursWorked * HOURLY_RATE;
	        } else {
	            totalWage = MAX_HOURS * HOURLY_RATE;
	        }

	        return totalWage;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int hoursWorked = 45;
	        int wage = computeEmployeeWage(hoursWorked);

	        System.out.println("Employee wage for " + hoursWorked + " hours: $" + wage);
	    }
	}



