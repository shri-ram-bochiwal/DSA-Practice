# Approach

- Initialize a 2D array dp, where dp[i][j] represents the maximum achievable value using the first i+1 items while respecting a constraint of j.

- Iterate over each item i and each constraint value j.

- Handle base cases:

    - If i is 0 (considering the first item) and j is 0 (no constraint), then dp[i][j] is set to 0 because no items are selected and no value is achievable.

    - If i is 0 (considering the first item), check if the constraint j allows selecting the item. If it does, set dp[i][j] to the value of the item B[i].

- For cases where both i and j are not 0, calculate the maximum achievable value:

    - If the constraint j is less than the weight of the current item C[i], it's not possible to select the current item within the given constraint. In this case, the value remains the same as the value achieved without considering the current item, so set dp[i][j] = dp[i-1][j].

    - If the constraint j is greater than or equal to the weight of the current item C[i], there are two options:

        - Include the current item: Calculate the value achievable by selecting the current item along with items that can be selected with the remaining constraint (j - C[i]). Add the value of the current item B[i] to this and compare it with the value achieved without considering the current item (dp[i-1][j]).

        - Exclude the current item: In this case, the value remains the same as the value achieved without considering the current item, so set dp[i][j] = dp[i-1][j].

- After iterating through all items and constraint values, the maximum achievable value will be stored in dp[n-1][A], where n is the length of array C and A is the given constraint.

- Return the value stored in dp[n-1][A] as the final result.


**Time Complexity** : O(N * A)

**Space Complexity** : O(N * A)