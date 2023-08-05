
/**
 * You are given the root node of a binary tree A. You have to find the max value of all node values of this tree.
 */

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
    
}

public class NodesMax {

    public int solve(TreeNode A) {
        if (A == null) {
            return Integer.MIN_VALUE;
        }

        int lmax = solve(A.left);
        int rmax = solve(A.right);

        return Math.max(Math.max(lmax, rmax), A.val);
    }

    public static void main(String[] args) {
        NodesMax solution = new NodesMax();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(3);

        System.out.println(solution.solve(root1));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(8);
        root2.left.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        System.out.println(solution.solve(root2));
    }

}
