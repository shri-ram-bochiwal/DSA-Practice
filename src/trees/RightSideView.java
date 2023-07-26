/**
 * Given a binary tree of integers denoted by root A. Return an array of integers representing the right view of the Binary tree.
 * Right view of a Binary Tree is a set of nodes visible when the tree is visited from Right side.
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

public class RightSideView {

    public ArrayList<Integer> solve(TreeNode A){
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<TreeNode> qu = new ArrayDeque<>();
        qu.add(A);
        while(qu.size() > 0){
            int size = qu.size();
            int lastValue = 0;
            for(int i = 0; i<size; i++){
                TreeNode removeNode = qu.remove();
                lastValue = removeNode.val;
                if(removeNode.left != null){
                    qu.add(removeNode.left);
                }
                if(removeNode.right != null){
                    qu.add(removeNode.right);
                }
            }
            ans.add(lastValue);
        }
        return ans;
    }

    public static void printRightSideView(ArrayList<Integer> ans){
        for(int i =0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        RightSideView solution = new RightSideView();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.right = new TreeNode(5);
        root1.right = new TreeNode(3);
        root1.right.right = new TreeNode(4);

        ArrayList<Integer> result1 = solution.solve(root1);
        printRightSideView(result1); 

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.left = new TreeNode(4);
        root2.left.left.left = new TreeNode(8);
        root2.left.right = new TreeNode(5); 
        root2.right = new TreeNode(3);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);       
                
        ArrayList<Integer> result2 = solution.solve(root2);
        printRightSideView(result2);

    }

}
