/**
 * Given a binary tree A, invert the binary tree and return it.
 * Inverting refers to making the left child the right child and vice versa.
 */


import java.util.*;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class InvertTheTree {

    public TreeNode invertTree(TreeNode A) {
        if (A == null) {
            return null;
        }

        TreeNode left = invertTree(A.left);
        TreeNode right = invertTree(A.right);

        A.left = right;
        A.right = left;

        return A;
    }

    public static void printTree(TreeNode A) {
        Queue<TreeNode> qu = new ArrayDeque<>();
        qu.add(A);
        while(qu.size() > 0){
            int size = qu.size();
            for(int i = 0; i<size; i++){
                TreeNode removeNode = qu.remove();
                System.out.print(removeNode.val+" ");
                if(removeNode.left != null){
                    qu.add(removeNode.left);
                }
                if(removeNode.right != null){
                    qu.add(removeNode.right);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InvertTheTree solution = new InvertTheTree();

        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);
        root1.right = new TreeNode(7);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(9);

        TreeNode result1 = solution.invertTree(root1);
        printTree(result1);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);

        TreeNode result2 = solution.invertTree(root2);
        printTree(result2);
    }

}
