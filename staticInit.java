import java.util.Scanner;


public class staticInit {

	/**
	 * @param args
	 */
	
	static boolean flag;
	static int B;
	static int H;
	static {
		try{
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
			if(B>0 && H>0){
				flag = true;
			}else
				throw new Exception("Breadth and height must be positive");	
		}catch(Exception e){
			System.out.println(e);
		}
	}
	

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}}

