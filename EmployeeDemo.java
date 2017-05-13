/*=============================================================================
|   Assignment:  Individual assignment: Programming - 2
|       Author:  Sampath Kumar Gunasekaran(sgunase2@uncc.edu)
|       Grader:  Harini Ramaprasad
|
|       Course:  ITCS 6112
|   Instructor:  Harini Ramaprasad
|     Due Date:  Sep 12 at 11:59PM
|
|     Language:  Java 
|	  Version :  1.8.0_101
|                
| Deficiencies:  No logical errors.
 *===========================================================================*/
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * This method is used to perform employee operations such as computing the
 * salary per pay period and vacation hours.
 */

public class EmployeeDemo {
	/**
	 * This method is used to parse and validate the employment start date in
	 * string type to Date type.
	 * 
	 * @param strDate
	 *            This is the first paramter to stringToDate method
	 * @return Date type date
	 */

	static public Date stringToDate(String strDate) {
		try {
			Date todayDate = new Date();
			DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			formatter.setLenient(false);
			Date date = formatter.parse(strDate);
			if (date.after(todayDate)) {
				System.out
						.println("Employment date cannot be greater than today's date");
				System.exit(1);
			} else
				return date;

		} catch (ParseException e) {
			System.out.println("Invalid date format " + strDate
					+ " Please enter in MM/dd/yyyy format");
			System.exit(1);
		}
		return null;

	}

	/**
	 * This method performs all the basic employee operations.
	 **/

	public void performEmployeeOperations() {
		System.out.println("Enter your first name: ");
		Scanner user_input = new Scanner(System.in);
		String firstName = user_input.next();
		System.out.println("Enter your last name: ");
		String lastName = user_input.next();
		System.out
				.println("Enter your employment start date in MM/dd/yyyy format: ");
		String employmentStartDate = user_input.next();
		Date empStartDate = stringToDate(employmentStartDate);
		System.out
				.println("Enter 'Yes' if you're a full time employee else 'No': ");
		String fullTimeEmp = user_input.next();
		if (fullTimeEmp.equalsIgnoreCase("yes")) {
			System.out.println("Enter your monthly salary");
			int monthlySalary = user_input.nextInt();
			FullTimeEmployee fullEmp = new FullTimeEmployee(lastName,
					firstName, empStartDate, monthlySalary);
			System.out
					.println("Salary and Vacation hours details of full-time employee "
							+ fullEmp.getFirstName().concat(
									fullEmp.getLastName()) + " is: ");
			System.out.println("Salary: " + fullEmp.getSalaryPerPayPeriod());
			System.out.println("Vacation Hours: "
					+ (fullEmp.calculateVacationHours()));
		} else if (fullTimeEmp.equalsIgnoreCase("no")) {
			System.out.println("Enter your hourly rate");
			int hourlyRate = user_input.nextInt();
			System.out.println("Enter the number of hours worked");
			int hoursWorked = user_input.nextInt();
			HourlyEmployee hourlyEmp = new HourlyEmployee(lastName, firstName,
					empStartDate, hourlyRate, hoursWorked);
			System.out
					.println("Salary and Vacation hours details of hourly employee "
							+ hourlyEmp.getFirstName().concat(
									hourlyEmp.getLastName()) + " is: ");
			System.out.println("Salary: " + hourlyEmp.getSalaryPerPayPeriod());
			System.out.println("Vacation days: "
					+ hourlyEmp.calculateVacationHours());
		} else {
			System.out
					.println("System couldn't recognize your imput. Enter Yes or No");
		}
		user_input.close();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeDemo employeeObj = new EmployeeDemo();
		employeeObj.performEmployeeOperations();
	}
}