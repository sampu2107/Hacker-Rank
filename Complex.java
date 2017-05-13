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

/**
 * The Complex program demonstrates the working of add,subtract,multiply,equals
 * and toString functions on two complex numbers.
 * 
 * @author Sampath Kumar
 * @version 1.0
 * @since 2016-09-09
 */
public class Complex {

	private double real;
	private double img;

	/**
	 * This method is used to create a complex representation of a complex
	 * number from its string representation.
	 * 
	 * @param str
	 *            This is the first paramter to createComplex method
	 * @return Complex type number
	 */

	public static Complex createComplex(String str) {
		str = str.replaceAll(" ", "");
		Complex complexNum = null;
		if (str.contains(String.valueOf("+"))
				|| (str.contains(String.valueOf("-")) && str.lastIndexOf('-') > 0)) {
			String re = "";
			String im = "";
			str = str.replaceAll("i", "");
			str = str.replaceAll("I", "");
			if (str.indexOf('+') > 0) {
				re = str.substring(0, str.indexOf('+'));
				im = str.substring(str.indexOf('+') + 1, str.length());
				complexNum = new Complex(Double.parseDouble(re),
						Double.parseDouble(im));
			} else if (str.lastIndexOf('-') > 0) {
				re = str.substring(0, str.lastIndexOf('-'));
				im = str.substring(str.lastIndexOf('-') + 1, str.length());
				complexNum = new Complex(Double.parseDouble(re),
						-Double.parseDouble(im));
			}
		} else {
			// For Pure imaginary number case
			if (str.endsWith("i") || str.endsWith("I")) {
				str = str.replaceAll("i", "");
				str = str.replaceAll("I", "");
				complexNum = new Complex(0, Double.parseDouble(str));
			}
			// For Pure real number case
			else {
				complexNum = new Complex(Double.parseDouble(str), 0);
			}
		}
		return complexNum;
	}

	private Complex(double real, double imag) {
		this.real = real;
		this.img = imag;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return img;
	}

	/**
	 * This method is used to add two complex numbers.
	 * 
	 * @param rhs
	 *            This is the first paramter to add method
	 * @return returns the addition of two Complex type numbers
	 */

	public Complex add(Complex rhs) {
		Complex a = this;
		double re = a.getReal() + rhs.getReal();
		double img = a.getImaginary() + rhs.getImaginary();
		return new Complex(re, img);
	}

	/**
	 * This method is used to subtract two complex numbers.
	 * 
	 * @param rhs
	 *            This is the first paramter to subtract method
	 * @return returns the subtraction of two Complex type numbers
	 */
	public Complex subtract(Complex rhs) {
		Complex a = this;
		double re = a.getReal() - rhs.getReal();
		double img = a.getImaginary() - rhs.getImaginary();
		return new Complex(re, img);
	}

	/**
	 * This method is used to find whether two complex numbers are equals.
	 * 
	 * @param rhs
	 *            This is the first paramter to equals method
	 * @return returns the boolean indicating whether two complex numbers are
	 *         equal or not.
	 */
	public boolean equals(Complex rhs) {
		if (rhs == null) {
			return false;
		} else if (!(rhs instanceof Complex)) {
			return false;
		} else {
			return ((this.getReal() == rhs.getReal()) && (this.getImaginary() == rhs
					.getImaginary()));
		}
	}

	/**
	 * This method is used to provide the string representation of a complex
	 * number.
	 * 
	 * @param rhs
	 *            This is the first paramter to toString method
	 * @return returns the string representation of the Complex type number
	 */
	public String toString() {
		if (this.getImaginary() == 0)
			return getReal() + "";
		if (this.getReal() == 0)
			return getImaginary() + "i";
		if (this.getImaginary() < 0)
			return getReal() + " - " + -(getImaginary()) + "i";
		return Double.toString(getReal()) + " + "
				+ Double.toString(getImaginary()) + "i";
	}
}
