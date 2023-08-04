import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
    
        TreeNode leftA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightB = lowestCommonAncestor(root.right, p, q);

        if (leftA != null && rightB != null) {
            return root;
        }

        if (leftA == null) {
            return rightB;
        }

        return leftA;
    }

    public static void main(String[] args) {
        LowestCommonAncestor solution = new LowestCommonAncestor();

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);
        root1.right = new TreeNode(1);
        root1.right.left = new TreeNode(0);
        root1.right.right = new TreeNode(8);

        TreeNode target1 = root1.left;
        TreeNode target2 = root1.right;

        TreeNode result1 = solution.lowestCommonAncestor(root1, target1, target2);
        System.out.println(result1.val);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right = new TreeNode(3);

        TreeNode target3 = root2.left.left;
        TreeNode target4 = root2.left.right;

        TreeNode result2 = solution.lowestCommonAncestor(root2, target3, target4);
        System.out.println(result2.val);
    }
}
