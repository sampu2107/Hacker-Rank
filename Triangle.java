
public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(foundInBermudaTriangle(0, 0, 2, 0, 4, 0, 2, 4, 0, 0));
System.out.println(foundInBermudaTriangle(3, 1, 7, 1, 5, 5, 1, 4, 1, 3));
	}
	
	public static int foundInBermudaTriangle(int x1, int y1, int x2, int y2, int x3, int y3,int px, int bx, int py, int by){
		double triangleArea = Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
		double planeArea = Math.abs((px*(y2-y3) + x2*(y3-py)+ x3*(py-y2))/2.0);
		double planeArea1 = Math.abs((x1*(py-y3) + px*(y3-y1)+ x3*(y1-py))/2.0);
		double planeArea2 = Math.abs((x1*(y2-py) + x2*(py-y1)+ px*(y1-y2))/2.0);
		double boatArea = Math.abs((bx*(y2-y3) + x2*(y3-by)+ x3*(by-y2))/2.0);
		double boatArea1 = Math.abs((x1*(by-y3) + bx*(y3-y1)+ x3*(y1-by))/2.0);
		double boatArea2 = Math.abs((x1*(y2-by) + x2*(by-y1)+ bx*(y1-y2))/2.0);
		double totalPlaneArea = planeArea+planeArea1+planeArea2;
		double totalBoatArea = boatArea+boatArea1+boatArea2;
		if(triangleArea == 0.0){
			return 0;
		}else if(totalPlaneArea == triangleArea && totalBoatArea != triangleArea){
			return 1;
		}else if(totalPlaneArea != triangleArea && totalBoatArea == triangleArea){
			return 2;
		}else if(totalPlaneArea == triangleArea && totalBoatArea == triangleArea){
			return 3;
		}else if(totalPlaneArea != triangleArea && totalBoatArea != triangleArea){
			return 4;
		}
		return 5;
	}
	
	public static double area(int x1, int y1, int x2, int y2, int x3, int y3){
		return Math.abs((x1*(y2-y3) + x2*(y3-y1)+ x3*(y1-y2))/2.0);
	}
	
	public static boolean isinside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y){
		double mainTriangle = area(x1, y1, x2, y2, x3, y3);
		double triangle1 = area(x, y, x2, y2, x3, y3);
		double triangle2 = area(x1, y1, x, y, x3, y3);
		double triangle3 = area(x1, y1, x2, y2, x, y);
		if(mainTriangle == triangle1+triangle2+triangle3){
			return true;
		}else
			return false;
	}

}
