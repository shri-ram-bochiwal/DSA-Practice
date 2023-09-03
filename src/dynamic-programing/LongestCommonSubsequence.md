# Approach 

- Initialize two variables, n and m, to store the lengths of the input strings A and B, respectively.

- Create a 2D array dp of size n x m to store the length of the longest common subsequence for various subproblems. Initialize all elements of dp to 0.

- Use nested loops to iterate through the characters of both strings A and B.

- At each position (i, j), compare the characters A[i] and B[j].

- If A[i] and B[j] are equal, increment the length of the LCS by 1, i.e., set dp[i][j] to dp[i-1][j-1] + 1.

- If A[i] and B[j] are not equal, take the maximum of the length of the LCS from the cell above, i.e., dp[i-1][j], and the cell on the left, i.e., dp[i][j-1], and set dp[i][j] to this maximum value.

- Continue this process for all characters of both strings.

- The value in the bottom-right cell, dp[n-1][m-1], represents the length of the LCS of strings A and B.

- Return dp[n-1][m-1] as the final result.

**Time Complexity** : O(N * M)

**Space Complexity** : O(N * M)

