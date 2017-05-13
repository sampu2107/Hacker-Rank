import java.util.Scanner;

public class output {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int strLen = 15;
		System.out.println("================================");
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			StringBuffer sb = new StringBuffer();
			int intLen = String.valueOf(x).length();
			int noOfSpaces = strLen - s1.length();
			sb.append(s1);
			for (int j = 0; j < noOfSpaces; j++) {
				sb.append(" ");
			}
			if (intLen == 3) {
				sb.append(x);
			} else if (intLen == 2) {
				sb.append(0);
				sb.append(x);
			} else if (intLen == 1) {
				sb.append(0);
				sb.append(0);
				sb.append(x);
			}
			System.out.println(sb.toString());
			// Complete this line
		}

		System.out.println("================================");

	}
}
