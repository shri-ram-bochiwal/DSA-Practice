# Approach

- Dynamic Programming Setup:

    - Create a 2D array dp to store computed results, with dimensions matching the input grid.
    
    - Initialize dp[i][j] with Integer.MAX_VALUE for all cells.
    
    - Recursive Helper Function: minimumPathSumHelper(grid, i, j)

- Base Cases:

    - If i or j are negative, return Integer.MAX_VALUE as this is not a valid path.
    
    - If i and j point to the top-left corner, return the value of the current cell grid[i][j].
    
    - If dp[i][j] already holds a value (not Integer.MAX_VALUE), return it.

- Recursive Steps:

    - Recursively compute two paths:

    - Moving up: minimumPathSumHelper(grid, i - 1, j)
    
    - Moving left: minimumPathSumHelper(grid, i, j - 1)
    
    - The minimum of these two paths plus the current cell's value grid[i][j] gives the optimal path sum.
    
    - Store this result in dp[i][j] and return it.

- Main Function: minimumPathSum(grid)

    - Calculate the number of rows n and columns m in the grid.

    - Initialize dp array as described in step 1.

    - Call minimumPathSumHelper(grid, n - 1, m - 1) to compute the minimum path sum starting from the bottom-right cell.

**Time Complexity** : O(n * m)

**Space Complexity** : O(n * m)