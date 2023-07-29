/**
 * Given a binary tree, return the preorder traversal of its nodes values.
 */

import java.util.*;


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int val){
        this.val = val;
        left = null;
        right = null;
    }

}

public class Preorder{
    public ArrayList<Integer> preorderTraversal(TreeNode A){
        ArrayList<Integer> result = new ArrayList<>();
        if(A == null){
            return result;
        }

        result.add(A.val);
        result.addAll(preorderTraversal(A.left));
        result.addAll(preorderTraversal(A.right));
        return result;
    }

    public static void printList(ArrayList<Integer> result){
        for(int i = 0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Preorder solution = new Preorder();

        TreeNode root1 = new TreeNode(1);
        root1.right = new TreeNode(2);
        root1.right.left = new TreeNode(3);

        ArrayList<Integer> ans1 = solution.preorderTraversal(root1);
        printList(ans1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(6);
        root2.right = new TreeNode(2);
        root2.right.left = new TreeNode(3);

        ArrayList<Integer> ans2 = solution.preorderTraversal(root2);
        printList(ans2);
    }

}