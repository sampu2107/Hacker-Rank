import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class myRegex{
   public static void main(String[] args){
      
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
       boolean fl = false;
      while(testCases>0){
         String line = in.nextLine();
         String pattern = "<(.+?)>([^<]+)</\\1>";
          Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(line);
          while(m.find()){
              System.out.println(m.group(2));
              fl=true;
          }
          if(!fl) {
              System.out.println("None");
          }
             //Write your code here
         
         testCases--;
      }
   }
}
