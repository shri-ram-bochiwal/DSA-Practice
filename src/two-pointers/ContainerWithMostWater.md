# Brute-Force Approach

- Initialize a variable maxArea to keep track of the maximum area found so far. Set it initially to 0.

- Use two nested loops to iterate through all possible pairs of vertical lines. The outer loop iterates from the first line to the second-to-last line (index i), and the inner loop iterates from the line after the outer loop's line to the last line (index j).

- For each pair of lines represented by indices i and j, calculate the width of the container as the absolute difference between the indices: width = |j - i|.

- Calculate the height of the container as the minimum of the heights of the two lines: containerHeight = min(height[i], height[j]).

- Calculate the area of the container as the product of the width and height: area = width * containerHeight.

- Update the maxArea if the calculated area is greater than the current maxArea.

- Continue iterating through all possible pairs of lines, calculating areas, and updating maxArea.

- Once both loops have finished, the maxArea will contain the maximum area possible. Return the maxArea as the result.


**Time Complexity** : O(N^2)

**Space Complexity** : O(1)


# Optimized Two-Pointer Approach

- Initialize two pointers, i and j, where i points to the first vertical line (at index 0) and j points to the last vertical line (at index height.length - 1).

- Initialize a variable result to 0. This variable will keep track of the maximum area found.

- Enter a while loop that continues as long as i is less than j. This loop is designed to explore different pairs of vertical lines.

- Calculate the area of the container formed by the current pair of lines (height[i] and height[j]) using the formula: area = min(height[i], height[j]) * (j - i).

- Compare the calculated area with the current maximum result. If the calculated area is greater than result, update result to the calculated area. This step ensures that result always contains the maximum area seen so far.

- Determine which pointer to move inward to explore other pairs. Move the pointer pointing to the shorter vertical line inward because:

    - Moving the pointer pointing to the taller line inward wouldn't increase the height of the container.

    - Moving the pointer pointing to the shorter line inward might increase the height of the container, and it also preserves or increases the width, which is crucial for maximizing the area.

- If height[i] is less than height[j], increment i. Otherwise, decrement j.

- Repeat steps 4-7 until i is no longer less than j. This ensures that we've considered all possible pairs of lines.

- Once the loop exits, result contains the maximum area found among all pairs of lines. Return result as the final answer.

**Time Complexity** : O(N)

**Space Complexity** : O(1)


