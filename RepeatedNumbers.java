package guvi;

import java.util.Arrays;

public class RepeatedNumbers {
	public int compare(Integer o1, Integer o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return (s2+s1).compareTo(s1+s2);
    }

    public static void main(String[] args) {
      RepeatedNumbers rn = new  RepeatedNumbers();
        Integer[] nums = {9,1,95,17,5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}