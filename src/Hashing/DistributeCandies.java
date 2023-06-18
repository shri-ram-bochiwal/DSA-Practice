/**
 * Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor.
 * The doctor advised Alice to only eat n / 2 of the candies she has (n is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
 * Given the integer array candyType of length n, return the maximum number of different types of candies she can eat if she only eats n / 2 of them.
 */

import java.util.*;

public class DistributeCandies {

    public int solve(int[] candyType){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<candyType.length; i++){
            set.add(candyType[i]);
        }
        return Math.min(set.size(), candyType.length/2);
    }

    public static void main(String[] args){
        int input1[] = {1,1,2,2,3,3};
        int input2[] = {1,1,2,3};
        int input3[] = {6,6,6,6};
        DistributeCandies candiesSolution = new DistributeCandies();
        System.out.println("Result For [1,1,2,2,3,3] : " + candiesSolution.solve(input1));
        System.out.println("Result For [1,1,2,3] : " + candiesSolution.solve(input2));
        System.out.println("Result For [6,6,6,6] : " + candiesSolution.solve(input3));
    }
    
}
