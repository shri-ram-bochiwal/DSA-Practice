/**
 * Given a Binary Search Tree A. Also given are two nodes B and C. Find the lowest common ancestor of the two nodes.
 * Note 1 :- It is guaranteed that the nodes B and C exist.
 * Note 2 :- The LCA of B and C in A is the shared ancestor of B and C that is located farthest from the root.
 */


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
        this.left = this.right = null;
    }

}

public class LcaInBst {

    public int solve(TreeNode A, int B, int C){
        if(A == null){
            return 0;
        }

        if(B > A.val && C > A.val){
            return solve(A.right, B, C);
        }

        else if(B < A.val && C < A.val){
            return solve(A.left, B, C);
        }

        return A.val;
    }

    public static void main(String[] args){
        LcaInBst solution = new LcaInBst();

        TreeNode root1 = new TreeNode(15);
        root1.left = new TreeNode(12);
        root1.left.left = new TreeNode(10);
        root1.left.left.left = new TreeNode(8);
        root1.left.right = new TreeNode(14);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(16);
        root1.right.right = new TreeNode(27);
        int target1 = 8;
        int target2 = 20;

        System.out.println(solution.solve(root1, target1, target2));

        TreeNode root2 = new TreeNode(8);
        root2.left = new TreeNode(6);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(7);
        root2.right = new TreeNode(21);
        int target3 = 7;
        int target4 = 1;

        System.out.println(solution.solve(root2, target3, target4));
    }

}
