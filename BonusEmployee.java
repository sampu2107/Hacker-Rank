/*=============================================================================
|   Assignment:  Individual assignment: Programming - 1
|       Author:  Sampath Kumar Gunasekaran(sgunase2@uncc.edu)
|       Grader:  Harini Ramaprasad
|
|       Course:  ITCS 6112
|   Instructor:  Harini Ramaprasad
|     Due Date:  Sep 2 at 11:59PM
|
|     Language:  Java 
|	  Version :  1.8.0_101
|                
| Deficiencies:  No logical errors.
 *===========================================================================*/

/**
 * The Employee class is an abstract class that contains basic employee
 * information.
 * 
 * @author Sampath Kumar
 * @version 1.0
 * @since 2016-08-31
 */
abstract class Employee {

	private String name, address;
	protected int basicSalary;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setAddress(String add) {
		address = add;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasicSalary(int sal) {
		basicSalary = sal;
	}

	/**
	 * This method is used to find the monthly salary along with the bonus.
	 */

	public abstract int getMonthlySalary();
}

/**
 * The Bonus Employee program finds out the yearly bonus for an employee
 * 
 * @author Sampath Kumar
 * @version 1.0
 * @since 2016-08-31
 */
public class BonusEmployee extends Employee {
	int basic_salary;
	int monthly_salary;

	public static void main(String[] args) {
		BonusEmployee emp = new BonusEmployee();
		emp.setName("Sampu");
		emp.setAddress("430 D Barton Creek DR");
		emp.setBasicSalary(72000);
		int yearly_bonus = emp.getMonthlySalary();
		if (yearly_bonus > 0) {
			System.out.println("Yearly Bonus Details");
			System.out.println("Name: " + emp.getName());
			System.out.println("Address: " + emp.getAddress());
			System.out.println("Yearly Basic Salary: "+emp.getBasicSalary());
			System.out.println("Yearly Bonus: " + yearly_bonus);
		}
	}

	/**
	 * This method is used to get the monthly salary for an employee.
	 * 
	 */
	public int getMonthlySalary() {
		int bonus = 1000;
		monthly_salary = bonus + (getBasicSalary() / 12);
		if (basic_salary < monthly_salary) {
			return getYearlyBonus(getBasicSalary(), monthly_salary);
		} else
			System.out
					.println("Basic salary cannot exceed the monthly salary or invalid salary");
		return 0;
	}

	/**
	 * This method is used to get the yearly bonus salary for an employee.
	 * 
	 * @param basicSalary
	 *            This is the first paramter to getYearlyBonus method
	 * @param monthlySalary
	 *            This is the second parameter to getYearlyBonus method
	 */
	public static int getYearlyBonus(int basicSalary, int monthlySalary) {
		int yearly_bonus = (monthlySalary * 12) - (basicSalary);
		return yearly_bonus;
	}
}
