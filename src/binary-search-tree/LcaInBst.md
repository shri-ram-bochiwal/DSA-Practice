# Approach 1

- The function takes three parameters: the current node A, and the values of nodes B and C that we want to find the LCA for.

- The base case is when the current node A is null (reached a leaf node or an empty subtree). In this case, the function returns 0.

- If both values B and C are greater than the value of the current node A, it means that both nodes are located in the right subtree. The function then recursively calls itself on the right child of A, passing B and C as parameters.

- If both values B and C are less than the value of the current node A, it means that both nodes are located in the left subtree. The function then recursively calls itself on the left child of A, passing B and C as parameters.

- If neither of the above conditions is met, it indicates that nodes B and C are on different sides of the current node A. Thus, the current node A is the lowest common ancestor of nodes B and C, and the function returns the value of the current node.

**Time Complexity** : O(log N)

**Space Complexity** : O(log N)

# Approach 2

- The function takes three parameters: the root node of the BST (TreeNode root), and the values of nodes B and C that we want to find the LCA for.

- The function uses a while loop that continues until the root becomes null.

- Inside the loop:

    **a**. If both values B and C are greater than the value of the current node root, it means that both nodes are located in the right subtree. Therefore, we update the root to its right child (root.right).

    **b**. If both values B and C are lesser than the value of the current node root, it means that both nodes are located in the left subtree. Therefore, we update the root to its left child (root.left).

    **c**. If neither of the above conditions is met, it indicates that nodes B and C are on different sides of the current node root. Thus, the current node root is the lowest common ancestor of nodes B and C, and the function returns the current root.

- If the loop completes without finding the LCA (i.e., if root becomes null), the function returns null.

**Time Complexity** : O(log N)

**Space Complexity** : O(1)