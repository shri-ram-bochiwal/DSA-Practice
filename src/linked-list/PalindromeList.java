
/**
 * Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.
 */

import java.util.*;

class ListNode {
    public int val;
    public ListNode next;

    ListNode(int val) {
        this.val = val;
    }

}

public class PalindromeList {

    public int checkPalindrome(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverseHead = reverseList(slow);
        ListNode tmp1 = A;
        ListNode tmp2 = reverseHead;
        while (tmp1 != null && tmp2 != null) {
            if (tmp1.val != tmp2.val) {
                return 0;
            }
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
        }
        return 1;

    }

    private ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previNode = null;
        while (current != null) {
            ListNode newNode = current.next;
            current.next = previNode;
            previNode = current;
            current = newNode;
        }
        return previNode;
    }

    public static void main(String[] args) {
        PalindromeList solution = new PalindromeList();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(2);
        list1.next.next.next = new ListNode(1);

        int result1 = solution.checkPalindrome(list1);
        System.out.println(result1);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(2);

        int result2 = solution.checkPalindrome(list2);
        System.out.println(result2);
    }

}

