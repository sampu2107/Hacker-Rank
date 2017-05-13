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
 * The Sherlocks program finds out the number of squares between the two
 * numbers.
 * 
 * @author Sampath Kumar
 * @version 1.0
 * @since 2016-08-31
 */
public class Sherlocks {

	/**
	 * This method is used to find the count of squares between the given range
	 * inclusively.
	 * 
	 * @param first_num
	 *            This is the first paramter to isSherlockSquare method
	 * @param second_num
	 *            This is the second parameter to isSherlockSquare method
	 */

	static void isSherlockSquare(int first_num, int second_num) {
		int count = 0;
		for (int i = first_num; i <= second_num; i++) {
			for (int j = 1; j * j <= i; j++) {
				if (j * j == i) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		int first_num;
		int second_num;
		try {
			first_num = Integer.parseInt(args[0]);
			second_num = Integer.parseInt(args[1]);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid Input");
			return;
		}
		isSherlockSquare(first_num, second_num);
	}
}
