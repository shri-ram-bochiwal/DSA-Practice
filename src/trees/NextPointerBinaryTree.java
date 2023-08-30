
/**
 * Given a binary tree,
 * Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
 * Initially, all next pointers are set to NULL.
 * Assume perfect binary tree.
 */

import java.util.*;

class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class NextPointerBinaryTree {

    public static void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> qu = new ArrayDeque<>();
        qu.add(root);

        while (!qu.isEmpty()) {
            int size = qu.size();
            for (int i = 0; i < size; i++) {
                TreeLinkNode tmp = qu.peek();
                qu.remove();
                if (i == size - 1) {
                    tmp.next = null;
                } else {
                    tmp.next = qu.peek();
                }
                if (tmp.left != null) {
                    qu.add(tmp.left);
                }
                if (tmp.right != null) {
                    qu.add(tmp.right);
                }
            }
        }
    }

    public static void levelOrderTraversal(TreeLinkNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeLinkNode node = queue.poll();
                System.out.print(node.val + " ");
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            System.out.println(); // Move to the next level
        }
    }

    public static void main(String[] args) {
        NextPointerBinaryTree solution = new NextPointerBinaryTree();

        TreeLinkNode root1 = new TreeLinkNode(1);
        root1.left = new TreeLinkNode(2);
        root1.right = new TreeLinkNode(3);

        TreeLinkNode root2 = new TreeLinkNode(1);
        root2.left = new TreeLinkNode(2);
        root2.left.left = new TreeLinkNode(3);
        root2.left.right = new TreeLinkNode(4);
        root2.right = new TreeLinkNode(5);
        root2.right.left = new TreeLinkNode(6);
        root2.right.right = new TreeLinkNode(7);

        solution.connect(root1);
        solution.connect(root2);
        System.out.println("Result For : ");
        levelOrderTraversal(root1);

        System.out.println("Result For : ");
        levelOrderTraversal(root2);
    }

}
