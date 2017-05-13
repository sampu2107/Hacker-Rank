import java.util.Arrays;


public class adding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a ={2,4,5};
		int[] b ={3,7,8};
		int[] c = new int[a.length+b.length];
		int p = 0;
		int k =1;
		int check = 10;
		boolean flag = false;
		for (int i = 0 ; i < a.length || i < b.length ; i++) {
		    if (i < a.length) {
		        c[p++] = a[i];
		    }
		    if (i < b.length) {
		        c[p++] = b[i];
		    }
		    
		    if(c[i]+c[k] == check){
		    	flag = true;
		    	
		    	
		    }}
		//System.out.println(Arrays.toString(c));
		if(flag){
			System.out.println("true");
		}else
			System.out.println("flase");
	}
}
