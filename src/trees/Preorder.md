# Approach

- Initialize an empty ArrayList called result that will store the preorder traversal elements.

- Check if the input binary tree node A is null. If it is null, it means there are no nodes in the tree, so return the empty result ArrayList.

- If A is not null, add the value of the current node A.val to the result ArrayList. This is the first step of the preorder traversal, as it visits the root node first.

- Recursively call the preorderTraversal function on the left subtree of node A and add all the elements it returns to the result ArrayList. This step will traverse the left subtree in a preorder manner.

- Recursively call the preorderTraversal function on the right subtree of node A and add all the elements it returns to the result ArrayList. This step will traverse the right subtree in a preorder manner.

- After both left and right subtrees are traversed and their elements are added to the result ArrayList, the function will return the result ArrayList, which now contains the preorder traversal of the entire binary tree.

**Time Complexity** : O(N)

**Space Complexity** : O(N)