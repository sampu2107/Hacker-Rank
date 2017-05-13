import java.io.*;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length()+B.length();
        System.out.println(length);
        char a = A.charAt(0);
        char b = B.charAt(0);
        if(a>b){
        	System.out.println("YES");
        }else
        	System.out.println("NO");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
