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
import java.util.Scanner;

public class ComplexDemo {

	/**
	 * This method is used to perform complex operations such as
	 * add,subtract,equals on two complex numbers
	 */

	public void performComplexOperations() {
		try {
			Scanner user_input = new Scanner(System.in);
			System.out.println("Enter the first complex number:");
			String firstComplex = user_input.next();
			System.out.println("Enter the second complex number:");
			String secondComplex = user_input.next();
			System.out
					.println("Enter the operation you would like to perform: 1:Addition 2:Subtaction 3: Equal");
			int option = user_input.nextInt();
			Complex firstComplexRep = Complex.createComplex(firstComplex);
			Complex secondComplexRep = Complex.createComplex(secondComplex);
			switch (option) {
			case 1: {
				Complex compAdd = firstComplexRep.add(secondComplexRep);
				System.out.println("Addition: " + compAdd.toString());
				break;
			}
			case 2: {
				Complex compSub = firstComplexRep.subtract(secondComplexRep);
				System.out.println("Subtraction: " + compSub.toString());
				break;
			}
			case 3: {
				boolean compEquals = firstComplexRep.equals(secondComplexRep);
				if (compEquals) {
					System.out.println("Both the complex numbers are equal");
				} else
					System.out
							.println("Both the complex numbers are not equal");
				break;
			}
			default: {
				System.out.println("Kindly enter option 1 2 or 3");
				break;
			}
			}
			user_input.close();
		}

		catch (Exception ex) {
			System.out.println("Invalid Complex Number");
		}

	}

	public static void main(String[] args) {
		ComplexDemo complexObj = new ComplexDemo();
		complexObj.performComplexOperations();
	}
}