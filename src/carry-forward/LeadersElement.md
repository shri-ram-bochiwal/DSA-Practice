# Approach 

- Initialize an ArrayList ans to store the leader elements.

- Start iterating through the input ArrayList A from right to left (from the last element to the first).

- Initialize maxProfit with the value of the last element of A since it's always a leader.

- For each element A[i] in the loop:

    - Check if A[i] is greater than maxProfit. If it is, then A[i] is a leader.

    - Update maxProfit to A[i].
    
    - Add A[i] to the ans ArrayList.

- Finally, return the ans ArrayList containing all the leader elements.

**Time Complexity** : O(N)

**Space Complexity** : O(N)