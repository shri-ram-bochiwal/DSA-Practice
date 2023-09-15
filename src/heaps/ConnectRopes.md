# Approach

- Inside the class, define a method minCost that takes an integer array A as input.

- Create a priority queue (pq) to store the rope lengths. A priority queue is used to efficiently extract the minimum values.

- Iterate through the elements of array A, and add each rope length to the priority queue pq.

- Initialize a variable cost to keep track of the total cost.

- Enter a loop that continues until the size of the priority queue (pq) is greater than 0.

- In each iteration of the loop:

    - Remove the two minimum lengths from the priority queue (pq). These represent the two shortest ropes.

    - Calculate the sum of these two lengths and add it to the cost.

    - If there are still more ropes in the priority queue (pq), add the sum back to the priority queue to consider it for future joinings.

- Continue this process until the priority queue contains only one element, which will be the final connected rope.

- Return the value of cost as the minimum cost to connect the ropes.

**Time Complexity** : (nlogn)

**Space Complexity** : (nlogn)