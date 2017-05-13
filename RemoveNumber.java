
public class RemoveNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeint("746209249", 5));

	}
	
	public static String removeint(String coordinates, int remove){
		String output = "";
		if(remove >= coordinates.length()){
			output = "0";
		}else if(remove ==0){
			output = coordinates;
		}else{
			int minIndex = 0;
			while(remove >0 && coordinates.length() >0){
				int firstBigDigit = getFirstBig(coordinates);
				System.out.println("first"+firstBigDigit);
				if(firstBigDigit >= 0){
					coordinates = removeDigit(coordinates, firstBigDigit);
				}else{
			            coordinates = removeDigit(coordinates, coordinates.length() - 1);
			        }

			        --remove;

				}
			}
		return coordinates;
	}

private static int getFirstBig(String number) {
    for(int i = 0; i < number.length() - 1; ++i) {
        int curDigit = number.charAt(i) - '0';
        System.out.println(curDigit);
        int nextDigit = number.charAt(i + 1) - '0';
        System.out.println(nextDigit);
        if(curDigit > nextDigit) {
        	System.out.println();
            return i;
        }
    }

    return -1;
}

private static String removeDigit(String number, int digitIndex) {
    String result = "";
    if(digitIndex > 0) {
        result = number.substring(0, digitIndex);
    }
    if(digitIndex < number.length() - 1) {
        result += number.substring(digitIndex + 1);
    }

    return result;
}

}