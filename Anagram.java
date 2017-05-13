import java.util.Arrays;
import java.util.Scanner;


public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		  		    
		        Scanner scan = new Scanner(System.in);
		        String a = scan.next();
		        String b = scan.next();
		        scan.close();
		        boolean ret = isAnagram(a, b);
		        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );


	}

	private static boolean isAnagram(String a, String b) {
		char[] first = a.toCharArray();
		char[] second = b.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		return Arrays.equals(first, second);
		// TODO Auto-generated method stub
	}

}
