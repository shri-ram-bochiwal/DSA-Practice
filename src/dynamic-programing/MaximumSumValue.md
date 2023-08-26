# Approach

- Calculate the length of the array A and store it in the variable n.

- Initialize a 2D array dp of size n by 4. This array will store the maximum values of expressions using different numbers of terms.

- Calculate the initial values for the base case:

    - dp[0][1] is set to the product of the first element of A and B.

    - dp[0][2] is set to the sum of dp[0][1] and the product of the first element of A and C.
    
    - dp[0][3] is set to the sum of dp[0][2] and the product of the first element of A and D.

- Start a loop that iterates through each index i from 1 to n-1.

- Inside the loop:

    - Update dp[i][1] to be the maximum value between the previous value of dp[i-1][1] and the product of the i-th element of A and B.

    - Update dp[i][2] to be the maximum value between the previous value of dp[i-1][2] and the sum of dp[i][1] and the product of the i-th element of A and C.

    - Update dp[i][3] to be the maximum value between the previous value of dp[i-1][3] and the sum of dp[i][2] and the product of the i-th element of A and D.

- After the loop completes, the maximum value of the expression is stored in dp[n-1][3], where n-1 represents the last index and 3 represents the maximum number of terms in the expression.

- Return the value stored in dp[n-1][3].

**Time Complexity** : O(N)

**Space Complexity** : O(N)