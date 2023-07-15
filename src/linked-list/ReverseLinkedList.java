
/**
 * You are given a singly linked list having head node A. You have to reverse the linked list and return the head node of that reversed list.
 * NOTE: You have to do it in-place and in one-pass.
 */

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {

    public ListNode reverseList(ListNode A) {
        ListNode previousNode = A;
        ListNode currentNode = A.next;
        while (currentNode != null) {
            ListNode newNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = newNode;
        }
        A.next = null;
        A = previousNode;
        return previousNode;
    }

    private static void printList(ListNode head) {
        ListNode currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);

        ListNode reversedList1 = solution.reverseList(list1);
        printList(reversedList1);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);

        ListNode reversedList2 = solution.reverseList(list2);
        printList(reversedList2);

        ListNode list3 = new ListNode(3);

        ListNode reversedlist3 = solution.reverseList(list3);
        printList(reversedlist3);
    }

}
