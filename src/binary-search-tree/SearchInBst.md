# Approach

- The method solve is a recursive function that searches for the node with value B in the BST. It starts from the root node (denoted by A) and traverses down the tree based on the value of the current node compared to B.

- The base case is the check for A == null. If the current node is null, it means we have reached a leaf node without finding the target value B. In this case, the method returns 0, indicating that the target node was not found at any depth.

- The next base case is the check for A.val == B. If the current node's value is equal to B, it means we have found the target node. Therefore, the method returns 1, representing the depth of the node with value B in the BST.

- If the current node's value (A.val) is greater than B, we know that the target node with value B must lie in the left subtree of the current node. So, we recursively call the solve method on the left subtree by passing A.left as the new root node and B as the target value.

- If the current node's value (A.val) is less than B, we know that the target node with value B must lie in the right subtree of the current node. So, we recursively call the solve method on the right subtree by passing A.right as the new root node and B as the target value.

- The method will continue traversing down the tree until it finds the target node or reaches a leaf node (null node) without finding the target. The depth of the target node is returned accordingly based on the above logic.

**Time Complexity** : O(H)

**Space Complexity** : O(H)