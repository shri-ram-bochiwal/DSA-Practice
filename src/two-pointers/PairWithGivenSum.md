# Two-Pointer Approach 

- Initialize the start variable to 0, the end variable to the length of the Pair array minus 1, and set pairSum, count, and mod variables to 0 and 1000000007, respectively.

- Enter a while loop that continues as long as start is less than end.

- Inside the loop:

    - Calculate pairSum as the sum of Pair[start] and Pair[end], modulo mod.

- Check if pairSum is equal to the target:

    - If Pair[start] is equal to Pair[end] and their sum is equal to the target, calculate the number of pairs with the same values and add it to count. Then, break out of the loop.
    
    - Otherwise, if Pair[start] and Pair[end] are not equal, count the number of elements with the same value as Pair[start] from the left (left) and the number of elements with the same value as Pair[end] from the right (right). Add left * right to count and increment start and decrement end as long as the elements are equal to Pair[start] or Pair[end], respectively.

- If pairSum is greater than the target, decrement end; if it's less than the target, increment start.

- Repeat steps 3-5 until start is no longer less than end.

- Return the result of count modulo mod as the final answer.

**Time Complexity** : O(NlogN)

**Space Complexity** : O(1)


# HashMap Approach

- Initialize a constant MOD to 1000000007. This constant will be used to calculate the result modulo MOD.

- Initialize a variable count to 0. This variable will be used to keep track of the count of pairs that sum to B.

- Create a frequencyMap as a HashMap to store the frequency of each number encountered in the input array A. The key in the map represents the number, and the value represents its frequency.

- Iterate through each element num in the input array A:

    - Calculate the complement as B - num. This represents the value that, when added to num, should equal B for a valid pair.

    - Check if the complement exists in the frequencyMap by using the containsKey method. If it exists:

        - Retrieve the frequency of the complement from the frequencyMap using frequencyMap.get(complement).

        - Increment the count by the frequency of the complement, and take the result modulo MOD. This accounts for all the pairs with num as one element and the complement as the other.
    
    - Update the frequencyMap by adding the current num to it. If num is not already in the map, use frequencyMap.getOrDefault(num, 0) + 1 to set its frequency to 1. If num is already in the map, increment its frequency by 1.

- After processing all elements in the input array A, return the final value of count. This represents the count of pairs in the array A whose sum is equal to B, taking into account their frequencies and considering the result modulo MOD.

**Time Complexity** : O(N)

**Space Complexity** : O(N)