# Approach 

- The solve function takes a parameter A, which represents the current node of the binary tree.

- The function starts with a base case to handle the situation when the current node is null (i.e., the tree is empty or the current node has no children). In such cases, the function returns the smallest possible integer value (Integer.MIN_VALUE) to signify that there is no maximum value in this subtree.

- For non-null nodes (i.e., nodes with values), the function proceeds with the recursive approach:

    **a** . It first recursively calls the solve function on the left child of the current node (i.e., A.left) and stores the result in the variable lmax. This step finds the maximum value in the left subtree of the current node.

    **b** . Similarly, the function then recursively calls the solve function on the right child of the current node (i.e., A.right) and stores the result in the variable rmax. This step finds the maximum value in the right subtree of the current node.

    **c** . Finally, the function compares the maximum values obtained from the left subtree (lmax) and the right subtree (rmax) with the value of the current node (A.val) using the Math.max method. This will give us the maximum value among the three, which is the maximum value in the subtree rooted at the current node A.

- The function returns this maximum value, which will be the largest value found in the entire binary tree.

**Time Complexity** : O(N)

**Space Complexity** : O(H)