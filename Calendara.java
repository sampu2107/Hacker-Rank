import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Calendara {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
       String sdf = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(cal.getTime());
       System.out.println(sdf.toUpperCase());
       
    }
}
