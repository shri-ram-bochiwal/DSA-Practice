/**
 * Given a Binary Search Tree A. Check whether there exists a node with value B in the BST.
 */

 
import java.util.*;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}

public class SearchInBst {

    public int solve(TreeNode A, int B){
        if(A == null){
            return 0;
        }

        if(A.val == B){
            return 1;
        }

        else if(A.val > B){
            return solve(A.left, B);
        }

        else{
            return solve(A.right, B);
        }
    }

    public static void main(String[] args){

        SearchInBst solution = new SearchInBst();

        TreeNode root1 = new TreeNode(15);
        root1.left = new TreeNode(12);
        root1.left.left = new TreeNode(10);
        root1.left.right = new TreeNode(14);
        root1.left.left.left = new TreeNode(8);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(16);
        root1.right.right = new TreeNode(27);
        int target1 = 16;

        System.out.println(solution.solve(root1, target1));

        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(6);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(7);
        int target2 = 9;

        System.out.println(solution.solve(root2, target2));
    }

}
