# Approach 

- n is the length of array B.

- dp is a 2D array used for dynamic programming. dp[i][j] represents the maximum value that can be obtained by considering the first i+1 elements from array B and having a total sum not exceeding j.

- The algorithm iterates through the 2D array dp using two nested loops. The outer loop runs for each index i from 0 to n-1, and the inner loop runs for each value of j from 0 to C.

- Inside the loops:

- If both i and j are 0, it means no elements are selected yet and the sum is 0, so dp[i][j] is set to 0.

- If only i is 0, it means only the first element of array B is available to select. If the value of j is greater than or equal to the value at B[i], then dp[i][j] is set to the value at A[i] (from array A).

- If only j is 0, it means the available sum is 0, so dp[i][j] is set to 0 as well.

- For other cases, the algorithm checks whether the current value of j is less than the value at B[i]. If it is, then it means the current element cannot be selected, so the value at dp[i][j] is copied from the previous row, i.e., dp[i-1][j].

- If j is greater than or equal to the value at B[i], then the algorithm considers two choices: either include the current element by subtracting B[i] from j and adding the value at A[i], or exclude the current element and keep the value from the previous row. The maximum of these two choices is stored in dp[i][j].


**Time Complexity** : O(N * C)

**Space Complexity** : O(N * C)
