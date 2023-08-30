# Approach

- The NextPointerBinaryTree class contains two methods: connect and levelOrderTraversal. It also has a main method that demonstrates the usage of the solution.

- The connect method takes a TreeLinkNode (assuming it's a custom class to represent a binary tree node with a next pointer) called root as an argument. It initializes a queue qu to perform a level-order traversal of the tree.

- The while loop runs as long as the queue is not empty. This loop handles each level of the tree. Inside the loop:

    - It starts by getting the size of the queue (number of nodes at the current level).

    - The loop then iterates over the nodes at the current level using the index i.

    - For each node in the current level:
        - It retrieves the front node of the queue using qu.peek() and stores it in tmp.

        - Removes the front node from the queue using qu.remove().

        - If i is equal to size - 1, it means the current node is the last node of the level, so its next pointer is set to null.

        - Otherwise, the next pointer of the current node is set to the front node of the queue (the next node in the same level).

        - If the current node has a left child, it's added to the queue.

        - If the current node has a right child, it's also added to the queue.

- The levelOrderTraversal method takes a TreeLinkNode called root and performs a level-order traversal of the tree using a standard BFS (Breadth-First Search) approach with a queue. It prints the nodes at each level on separate lines.

- The main method demonstrates the usage of the solution:

    - It creates two binary trees (root1 and root2) using the TreeLinkNode class.

    - It calls the connect method to populate the next pointers in the trees.

    - It then calls the levelOrderTraversal method to print the levels of both trees.



**Time Complexity** : O(N)

**Space Complexity** : O(N)