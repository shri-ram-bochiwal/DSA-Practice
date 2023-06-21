
/**
 * Given an array A of non-negative integers, arrange them such that they form
 * the largest number.
 * Note: The result may be very large, so you need to return a string instead of
 * an integer.
 */

import java.util.*;

public class LargestNumber {

    public String solve(final int[] A){
        String arr[] = new String[A.length];
        for(int i = 0; i<A.length; i++){
            arr[i] = String.valueOf(A[i]);
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b){
                String order1 = a + b;
                String order2 = b + a;

                return order2.compareTo(order1);
            }
        });

        if(arr[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<arr.length; i++){
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args){
        int input1[] = {3, 30, 34, 5, 9};
        int input2[] = {2, 3, 9, 0};
        LargestNumber solution = new LargestNumber();
        System.out.println("Result For [3, 30, 34, 5, 9] : " + solution.solve(input1));
        System.out.println("Result For [2, 3, 9, 0] : " + solution.solve(input2));
    }
    
}
