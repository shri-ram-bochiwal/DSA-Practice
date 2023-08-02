# Approach

- First, the function is called with a node (A) of the given tree. If the node is null, the function returns null, which helps in reversing the current node.

- In the recursive call, you invert the left and right children of the current node (A), which changes their positions, effectively reversing the subtree rooted at the current node (A).

- After inverting the children, you set the inverted children as the new children of the current node (A). This amalgamates the children which were previously the left and right children.

- After all the operations, the function returns the reversed node (A).

**Time Complexity** : O(N)

**Space Complexity** : O(N)