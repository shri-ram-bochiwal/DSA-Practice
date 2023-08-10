# Approach 1st

- Create a PriorityQueue (min-heap) to hold the elements.

- Iterate through the first B+1 elements of array A and add them to the priority queue.

- Initialize an array ans of length n to store the sorted elements.

- Initialize a variable k to keep track of the current index in the ans array.

- Iterate through the remaining elements of array A starting from index B+1:

    **a**. Remove the smallest element from the priority queue and store it in ans[k].

    **b**. Add the current element from array A to the priority queue.

    **c**. Increment k.

- After processing the remaining elements, extract the remaining elements from the priority queue and store them in the ans array.

- Return the sorted ans array.

**Time Complexity** : O(N logB)

**Space Complexity**: O(B);


# Approach 2nd

- Initialize an integer array ans with the same length as array A to store the sorted elements.

- Create a PriorityQueue (min-heap) to hold the elements.

- Iterate through each element of array A and add them to the priority queue.

- Iterate through each element of array A again:

    **a**. Remove the smallest element from the priority queue.
    
    **b**. Store the removed element in the corresponding index of the ans array.

- After processing all elements, the ans array will contain the elements of array A sorted in ascending order.

- Return the ans array.

**Time Complexity** : O(N logN)

**Space Complexity**: O(N);


