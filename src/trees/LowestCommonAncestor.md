# Approach 1st

- First, we check if the current node root is null or if it is either of the target nodes p or q. If any of these conditions are met, we return the current node root as it represents the lowest common ancestor for p and q in this subtree.

- If the current node root is not a target node, we recursively call the lowestCommonAncestor function on its left and right subtrees to search for p and q in each subtree.

- We get two results from the recursive calls: leftA, which is the lowest common ancestor for p and q in the left subtree, and rightB, which is the lowest common ancestor for p and q in the right subtree.

- Next, we check if both leftA and rightB are not null. If this is the case, it means that p and q are found in separate subtrees of the current node root. In this situation, the current node root is the lowest common ancestor for p and q, so we return root.

- If leftA is null, it means that both p and q are in the right subtree, and rightB represents their lowest common ancestor. So, we return rightB.

- If rightB is null, it means that both p and q are in the left subtree, and leftA represents their lowest common ancestor. So, we return leftA.

**Time Complexity** : O(N)

**Space Complexity** : O(H)

# Approach 2nd 

**nodeToPath function** :

- The purpose of this function is to construct the path from a given node to the root in the binary tree A, including the node itself.

- The function handles the base case where if the current node A is null, it returns an empty ArrayList.

- It uses a pre-order traversal approach. If the value of the current node A matches the target value k, it creates an ArrayList containing only the value of A and returns it.

- If the value of the current node A does not match the target value k, it divides into two specific areas: "In - Area" and "Post - Area".

- In the "In - Area", the function recursively calls itself on the left subtree of A to obtain the path to k. 

- If the obtained path is not empty, it adds the value of A to the path and returns it.

- In the "Post - Area", the function recursively calls itself on the right subtree of A to obtain the path to k. If the obtained path is not empty, it adds the value of A to the path and returns it.

- If the path to k is not found after exploring both areas, it returns an empty ArrayList.

**lca function** :

- The purpose of this function is to find the lowest common ancestor (LCA) of two nodes B and C in the binary tree A.

- To achieve this, the function calls the nodeToPath function twice - once for node B and once for node C.These function calls result in two separate ArrayLists containing the paths to the respective nodes B and C.

- The function then uses a while loop to traverse both ArrayLists from the end. It compares the values of the nodes at the same index in both paths. When the condition path1.get(i) == path2.get(j) becomes false, the loop stops, and at that point, i and j point to the last common node in both paths.

- The function then returns the value of path1.get(i+1), which represents the LCA. The "+1" is added to i because the previous value of i and j separated the common node, and to bring them to the LCA, an increment is necessary.

**Time Complexity** : O(N)

**Space Complexity** : O(H)