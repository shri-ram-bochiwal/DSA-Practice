/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 */

import java.util.*;

public class CheckNDoubleExists {

    public boolean checkIfExist(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == 2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int input1[] = {10,2,5,3};
        int input2[] = {3,1,7,1};
        CheckNDoubleExists solution = new CheckNDoubleExists();
        System.out.println("Result For [10,2,5,3] : " + solution.checkIfExist(input1));
        System.out.println("Result For [3,1,7,1] : " + solution.checkIfExist(input2));
    }

}
