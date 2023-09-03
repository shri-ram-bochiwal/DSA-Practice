# Approach 

- The code defines a class MatrixChainMultiplication with a few methods:

    - dp: A 2D array to store the results of subproblems.

    - solve(int[] A): This method initiates the matrix chain multiplication calculation. It initializes the dp array and calls the mcm method to find the minimum cost.
    
    - mcm(int i, int j, int[] A): This is a recursive method that uses memoization (dynamic programming) to find the minimum cost of multiplying matrices from index i to j.

- In the mcm method, the following steps are performed:

    - If i+1 == j, it means there is only one matrix, so the cost is 0.

    - If the result for the current subproblem (dp[i][j]) is already calculated (not -1), return that value.

    - Initialize minCost as Integer.MAX_VALUE to store the minimum cost.

    - Iterate through all possible positions k to split the matrices between i and j.

    - Calculate the cost for multiplying matrices from i to k and from k to j, as well as the cost of multiplying the resulting matrices (selfCost).

    - Update minCost with the minimum of the current minimum cost and the new total cost.

    - Store the minimum cost in dp[i][j] and return it.

- In the main method, two sets of matrix dimensions (input1 and input2) are provided, and the MatrixChainMultiplication class is used to calculate the minimum multiplication cost for each set of matrices.

**Time Complexity** : O(N^3)

**Space Complexity** : O(N^2)

