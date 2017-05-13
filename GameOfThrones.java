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

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * The GameOfThrones program finds out the whether the given string is an
 * anagram or not.
 * 
 * @author Sampath Kumar
 * @version 1.0
 * @since 2016-08-31
 */

public class GameOfThrones {

	/**
	 * This method is used to find whether the input string is an anagram of
	 * word 'silent'.
	 * 
	 * @param anagram_input
	 *            This is the first paramter to isValidKey method
	 * @param key_input
	 *            This is the second parameter to isValidKey method
	 */

	static void isValidKey(String anagram_input, String key_input) {
		boolean key_status = true;
		key_input.replaceAll("\\s", ""); // Removing white spaces if any
		key_input = key_input.toLowerCase(); // changing it to lower case
		if (key_input.length() != anagram_input.length()) {
			key_status = false; // Setting it to false, if length doesn't match
		} else {
			/* Changing the strings to char array */
			char[] key_array = key_input.toCharArray();
			char[] anagram_array = anagram_input.toCharArray();
			/* Sorting both the arrays */
			Arrays.sort(key_array);
			Arrays.sort(anagram_array);
			key_status = Arrays.equals(key_array, anagram_array);
		}
		if (key_status) {
			System.out.println("YES");
		} else
			System.out.println("NO");
	}

	public static void main(String[] args) {
		String key_input = args[0];
		String anagram_input = "silent";
		if (Pattern.matches("[a-zA-Z]+", key_input)) {
			isValidKey(anagram_input, key_input);
		} else {
			System.out.println("Invalid Input");
		}
	}
}
