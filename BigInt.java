import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         
        BigInteger b1,b2,b3,b4;
        b1 = new BigInteger(sc.next());
        b2 = new BigInteger(sc.next());
        b3 = b1.add(b2);
        b4 = b1.multiply(b2);
        System.out.println(b3);
        System.out.println(b4);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}