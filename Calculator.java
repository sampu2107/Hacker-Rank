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
 * The Calculator program implements the interface AdvancedArithmetic, accepts
 * an integer input and finds the sum of all its divisors.
 * 
 * @author Sampath Kumar
 * @version 1.0
 * @since 2016-08-31
 */
public class Calculator implements AdvancedArithmetic {

	/**
	 * This method accepts an integer and finds the sum of all its divisors
	 * 
	 * @param n
	 *            This is the first paramter to divisor_sum method
	 * @return returns the sum of the divisors.
	 * @see calculator.AdvancedArithmetic#divisor_sum(int)
	 */
	public int divisor_sum(int n) {
		int sum = 1;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int input;
		try {
			input = Integer.parseInt(args[0]);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid Input");
			return;
		}
		if (input != 0 && input <= 1000) {
			Calculator div = new Calculator();
			int output = div.divisor_sum(input);
			System.out.println(output);
		} else
			System.out.println("Value of n cannot be zero and can be at most 1000");
	}
}
