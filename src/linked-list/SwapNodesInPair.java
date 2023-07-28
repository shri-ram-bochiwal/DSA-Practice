/**
 * Given a linked list A, swap every two adjacent nodes and return its head.
 * NOTE: Your algorithm should use only constant space. You may not modify the values in the list; only nodes themselves can be changed.
 */

import java.util.*;


class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class SwapNodesInPair {

    public ListNode swapPairs(ListNode A){
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = A;
        ListNode previousNode = dummyNode;
        ListNode currentNode = A;

        while(currentNode != null && currentNode.next != null){
            ListNode newNode = currentNode.next;
            ListNode tmpNode = newNode.next;

            previousNode.next = newNode;
            newNode.next = currentNode;
            currentNode.next = tmpNode;

            previousNode = currentNode;
            currentNode = tmpNode;
        }
        return dummyNode.next;
    }

    public static void printSwapNode(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        SwapNodesInPair solution = new SwapNodesInPair();

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);

        ListNode result1 = solution.swapPairs(list1);
        printSwapNode(result1);

        ListNode list2 = new ListNode(7);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(1);

        ListNode result2 = solution.swapPairs(list2);
        printSwapNode(result2);
    }

}
