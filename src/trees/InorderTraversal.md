# Approach 1st 

- First, we check if the input tree A is empty or not. If it is empty, we return an empty ArrayList called ans.

- If the tree is not empty, we create a second ArrayList, which includes the results from the left subtree obtained by calling inorderTraversal(A.left).

- Then, we add the value of the current node A.val to the ArrayList.

- Next, we create a third ArrayList, which includes the results from the right subtree obtained by calling inorderTraversal(A.right).

- Finally, we add the elements of the third ArrayList to the end of the second ArrayList, and return the complete ArrayList.

**Time Complexity** : O(N)

**Space Complexity** : O(N)


# Approach 2nd

- The main function inorderTraversal(TreeNode A) initializes an integer variable N with the size of the binary tree A obtained from the size() function. It then creates an integer array ans of size N to store the inorder traversal values.

- The size(TreeNode A) function is a recursive function that calculates the number of nodes in the binary tree A. It does this by counting the nodes in the left subtree ls, the nodes in the right subtree rs, and adding 1 for the current node. The total number of nodes in the binary tree is then ls + rs + 1.

- The traversal(TreeNode root, int[] ans) function performs the actual inorder traversal. It is a depth-first approach that traverses the binary tree in the following steps:

  **a**. Check if the current node root is null. If it is null, return from the function as there is nothing to process.

  **b**. Recursively call the traversal() function on the left subtree of the current node root, passing the same ans array. This step will visit all nodes in the left subtree in the inorder order and store their values in the ans array.

  **c**. Store the value of the current node root.val in the ans array at the index i. Increment the index i by 1 to move to the next available position in the ans array.

  **d**. Recursively call the traversal() function on the right subtree of the current node root, passing the same ans array. This step will visit all nodes in the right subtree in the inorder order and store their values in the ans array.

- Finally, the ans array contains the inorder traversal of the binary tree. It is returned by the inorderTraversal() function as the final output.

**Time Complexity** : O(N)

**Space Complexity** : O(N)