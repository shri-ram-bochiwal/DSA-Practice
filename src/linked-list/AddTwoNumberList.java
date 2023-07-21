
/**
 * You are given two linked lists, A and B, representing two non-negative numbers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return it as a linked list.
 */

import java.util.*;

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class AddTwoNumberList {

    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        int carry = 0;
        ListNode previousList, dummy = new ListNode(0);
        previousList = dummy;
        while (A != null || B != null || carry != 0) {
            if (A != null) {
                carry += A.val;
                A = A.next;
            }
            if (B != null) {
                carry += B.val;
                B = B.next;
            }
            previousList.next = new ListNode(carry % 10);
            carry /= 10;
            previousList = previousList.next;
        }
        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AddTwoNumberList solution = new AddTwoNumberList();
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);

        ListNode addList1 = solution.addTwoNumbers(list1, list2);
        printList(addList1);

        ListNode list3 = new ListNode(9);
        list3.next = new ListNode(9);

        ListNode list4 = new ListNode(1);

        ListNode addList2 = solution.addTwoNumbers(list3, list4);
        printList(addList2);
    }

}
