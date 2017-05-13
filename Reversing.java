import java.util.StringTokenizer;


public class Reversing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String a = "lets meet";
		   StringBuffer sb = new StringBuffer();
		   int last = 0;
		   char[] ch = a.toCharArray();
		   int start=0;
		   int count =0;
		   System.out.println(ch.length);
		   for(int i =0;i<ch.length;i++){
			   count++;
			   System.out.println("hh"+count);
			   if(ch[i] == ' '){
				   sb.append(' ');
			   }else{System.out.println(i);
				   		start=i;
				   	do{
				   		i++;
				   		}while(i<ch.length && ch[i]!=' ');
					   last = --i;
					   System.out.println(last);
					  
				   for(int j=last;j>=start;j--){
					   sb.append(ch[j]);
					   System.out.println(sb.toString());
				   }
			   }
		   }
		   System.out.println(sb.toString());
	}   
	    
	}

