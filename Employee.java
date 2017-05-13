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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * The Employee class is an abstract class that contains basic employee
 * information.
 * 
 * @author Sampath Kumar
 * @version 1.0
 * @since 2016-09-09
 */

public abstract class Employee {
	private String lastName;
	private String firstName;
	private Date employmentStartDate;

	public Employee(String lname, String fname, Date start) {
		this.lastName = lname;
		this.firstName = fname;
		this.employmentStartDate = start;
	}

	/**
	 * This method is used to find the salary per pay period.
	 */
	public abstract int getSalaryPerPayPeriod();

	/**
	 * This method is used to calculate the vacation hours of an employee.
	 */
	public abstract int calculateVacationHours();

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the employmentStartDate
	 */
	public Date getEmploymentStartDate() {
		return employmentStartDate;
	}

	/**
	 * @param employmentStartDate
	 *            the employmentStartDate to set
	 */
	public void setEmploymentStartDate(Date employmentStartDate) {
		this.employmentStartDate = employmentStartDate;
	}
}

/**
 * The FullTimeEmployee class contains information about the full time
 * employees.
 * 
 * @author Sampath Kumar
 * @version 1.0
 * @since 2016-09-09
 */

class FullTimeEmployee extends Employee {

	private int monthlySalary;

	public FullTimeEmployee(String lname, String fname, Date start,
			int monthlySalary) {
		super(lname, fname, start);
		this.monthlySalary = monthlySalary;
	}

	/**
	 * This method is used to find the salary per pay period of a full-time
	 * employee.
	 */

	public int getSalaryPerPayPeriod() {
		return monthlySalary;
	}

	/**
	 * This method is used to calculate the vacation hours of a full-time
	 * employee.
	 */

	public int calculateVacationHours() {
		Date startDate = getEmploymentStartDate();
		Date todayDate = new Date();
		int vacationHours = 0;
		Calendar firstCal = GregorianCalendar.getInstance();
		Calendar secondCal = GregorianCalendar.getInstance();
		firstCal.setTime(startDate);
		secondCal.setTime(todayDate);
		int diffYear = secondCal.get(Calendar.YEAR)
				- firstCal.get(Calendar.YEAR);
		int currentMonth = secondCal.get(Calendar.MONTH) + 1;
		int startMonth = (firstCal.get(Calendar.MONTH) + 1);
		int actualMonths = diffYear * 12 + (currentMonth - startMonth);
		if ((firstCal.get(Calendar.DATE) > secondCal.get(Calendar.DATE))
				&& (currentMonth == startMonth)) {
			actualMonths = actualMonths - 1;
		}
		if (actualMonths < 24) {
			vacationHours = 40;
		} else if (actualMonths >= 24 && actualMonths < 60) {
			vacationHours = 80;
		} else if (actualMonths >= 60 && actualMonths < 120) {
			vacationHours = 120;
		} else if (actualMonths >= 120) {
			vacationHours = 160;
		}
		return vacationHours;
	}

	/**
	 * @return the monthlySalary
	 */
	public int getMonthlySalary() {
		return monthlySalary;
	}

	/**
	 * @param monthlySalary
	 *            the monthlySalary to set
	 */
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

}

/**
 * The HourlyEmployee class contains information about the hourly employees.
 * 
 * @author Sampath Kumar
 * @version 1.0
 * @since 2016-09-09
 */

class HourlyEmployee extends Employee {

	private int hourlyRate;
	private int hoursWorked;

	public HourlyEmployee(String lname, String fname, Date start,
			int hourlyRate, int hoursWorked) {
		super(lname, fname, start);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	/**
	 * This method is used to find the salary per pay period of a hourly
	 * employee.
	 */
	public int getSalaryPerPayPeriod() {
		return (hourlyRate * hoursWorked);
	}

	public int calculateVacationHours() {
		return 0;
	}

	/**
	 * @return the hourlyRate
	 */
	public int getHourlyRate() {
		return hourlyRate;
	}

	/**
	 * @param hourlyRate
	 *            the hourlyRate to set
	 */
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	/**
	 * @return the hoursWorked
	 */
	public int getHoursWorked() {
		return hoursWorked;
	}

	/**
	 * @param hoursWorked
	 *            the hoursWorked to set
	 */
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
