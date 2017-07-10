package List;

public class RomanNum {
	public static String main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
	    int times = 0;
	    String[] romans = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",
	            "XC", "C", "CD", "D", "CM", "M" };
	    int[] ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,
	            900, 1000 };
	    for (int i = ints.length - 1; i >= 0; i--) {
	        int num1 = 0;
			times = num1 / ints[i];
	        num1 %= ints[i];
	        while (times > 0) {
	            sb.append(romans[i]);
	            times--;
	        }
	    }
	    return sb.toString();

		
	}

}
