import java.io.*;
import java.util.*;

public class lexi {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String s = in.next();
    	int k = in.nextInt();
    	char[] c = s.toCharArray();
    	List<String> li = new ArrayList<String>();
    	for(int i=0;i<=s.length()-k;i++){
    		li.add(s.substring(i, i+k));
    	}
    	
  Collections.sort(li);
  String min = li.get(0);
  String max = li.get(li.size()-1);
  System.out.println(min);
  System.out.println(max);
    }
}