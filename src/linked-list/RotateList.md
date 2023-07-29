# Approach

- First, the code checks if head is null, or there is only one node (head.next == null), or the value of k is 0. In such cases, the function directly returns head because there is no need to rotate in these scenarios.

- If there are two or more nodes in the linked list, and k is not 0, it calculates the length of the linked list by traversing through it using a loop. The variable length stores the total number of nodes.

- Then, it positions the current variable at the last node by traversing from head to the end.

- Next, it connects the next pointer of the last node (current) to the head, effectively making the linked list circular. This step is necessary to facilitate rotation.

- The value of k is then calculated to determine the number of steps to move right. The formula used is k = length - k % length. The % operator ensures that k is reduced to a value less than length.

- The current node is moved k steps right.

- The head pointer is updated to point to the node after current, making current the new head node.

- Finally, to break the circular nature of the original linked list, the next pointer of current node is set to null.

- The updated head is returned.

**Time Complexity** : O(N)

**Space Complexity** : O(1)