/**
 * Given the head of a linked list, rotate the list to the right by k places.
 */

import java.util.*;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class RotateList {
    public ListNode rotateRight(ListNode head, int k){
        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode current = head;
        int length = 1; 
        while(current.next != null){
            length++;
            current = current.next;
        }
        current.next = head;
        k = length-k%length;
        while(k>0){
            current = current.next;
            k--;
        }
        head = current.next;
        current.next = null;
        return head;
    }

    public static void printList(ListNode head ){
        ListNode curent = head;
        while(curent != null){
            System.out.print(curent.val + " ");
            curent = curent.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        RotateList solution = new RotateList();

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        int target1 = 2;

        ListNode result1 = solution.rotateRight(list1, target1);
        printList(result1);

        ListNode list2 = new ListNode(0);
        list2.next = new ListNode(1);
        list2.next.next = new ListNode(2);
        int target2 = 4;

        ListNode result2 = solution.rotateRight(list2, target2);
        printList(result2);
    }

}
