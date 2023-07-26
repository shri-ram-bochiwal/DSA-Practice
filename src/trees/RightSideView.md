# Approach

- First, we create an ArrayList called "ans," which will be used to store the right side view of the binary tree.

- Next, we use an expanded Queue (ArrayDeque) to traverse the binary tree. Initially, we enqueue the root node into the queue.

- Now, we create a variable "lastValue," which will be used to keep track of the value of the rightmost node at each level. We initialize "lastValue" to 0 initially.

- We process all the nodes at the current level using a "for" loop. In this loop, we update the "lastValue" with the value of each node.

- Every time we move to a new level (as we are popping nodes at each level), we update "lastValue," and it holds the value of the rightmost node at that level.

- This way, at the end, we add the value of the rightmost node to the "ans" list.

- We continue this process until there are no nodes left in the Queue (i.e., it becomes empty).

- Finally, we return the "ans" list, which contains the values of the right side view of the binary tree in the correct order.

**Time Complexity** : O(N)

**Space Complexity** : O(N)