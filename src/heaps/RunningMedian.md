# Approach 1st

- Create two Priority Queues - one in reverse order (max-heap) and the other in default order (min-heap).

- Initialize an empty array result with the same size as array A.

- For each item in array A, perform the following operations:

    **a**. If the sizes of left and right are equal, add the item to the right heap, then remove an item from right and add it to the left heap. Set the value of left.peek() in the result array.

    **b**. If the size of left is one more than the size of right, add the item to the left heap, then remove an item from left and add it to the right heap. Set the value of left.peek() in the result array.

- Return the result array.

**Time Complexity** : O(N logN)

**Space Complexity** : O(N)


# Approach 2nd

- Initialize an empty ArrayList B and an integer array C of the same length as array A.

- Iterate through each element in array A:

    **a**. Add the current element to ArrayList B.
    
    **b**.Sort the ArrayList B using Collections.sort(B).

- Calculate the index of the median in the sorted ArrayList B. If the size of B is even, the median index is (B.size() / 2) - 1, and if the size is odd, the median index is B.size() / 2.

- Determine the median value based on the size of B:

    **a**. If the size is even, calculate the median as the average of two middle elements: (B.get(medianIndex - 1) + B.get(medianIndex)) / 2.
    
    **b**.If the size is odd, the median is the middle element: B.get(medianIndex).

- Store the calculated median value in the C array at the current index i.

- Repeat steps 2 to 5 for all elements in array A.

- Return the integer array C containing the medians corresponding to each element in array A.

**Time Complexity** : O(N^2 log N)

**Space Complexity** : O(N)