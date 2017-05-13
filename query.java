import java.util.*;
import java.io.*;

class query{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum[] = new int[n];
            StringBuffer sb = new StringBuffer();
            sum[0] = (int) (a + (b*1));
            for(int j=1;j<n;j++){
            	sum[j] = sum[j-1] + (int) (b*Math.pow(2,j));
            }
            for(int k=0;k<sum.length;k++){
            	sb.append(sum[k]);
            	sb.append(" ");
            }
            System.out.println(sb.toString());        
        }
        in.close();
    }
}
