
/**
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

}

public class InorderTraversal {

    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (A == null) {
            return ans;
        }
        ans.addAll(inorderTraversal(A.left));
        ans.add(A.val);
        ans.addAll(inorderTraversal(A.right));
        return ans;
    }

    public static void printTree(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InorderTraversal solution = new InorderTraversal();

        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        ArrayList<Integer> result1 = solution.inorderTraversal(root1);
        printTree(result1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(6);
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(3);

        ArrayList<Integer> result2 = solution.inorderTraversal(root2);
        printTree(result2);

        TreeNode root3 = new TreeNode(0);

        ArrayList<Integer> result3 = solution.inorderTraversal(root3);
        printTree(result3);
    }

}
