
/**
 * Given a linked list A, remove the B-th node from the end of the list and return its head. For example, Given linked list: 1->2->3->4->5, and B = 2. After removing the second node from the end, the linked list becomes 1->2->3->5. NOTE: If B is greater than the size of the list, remove the first node of the list. NOTE: Try doing it using constant additional space.
 */

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class RemoveNthNodeInList {

    public ListNode removeNthFromEnd(ListNode A, int B) {
        if (A == null || A.next == null) {
            return null;
        }

        ListNode slow = A;
        ListNode fast = A;
        while (B > 0) {
            if (fast == null) {
                return A.next;
            }
            fast = fast.next;
            B--;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (B == 0 && fast == null) {
            A = A.next;
        } else {
            slow.next = slow.next.next;
        }
        return A;
    }

    public static void printList(ListNode A) {
        ListNode currentNode = A;
        while (currentNode != null) {
            System.out.print(currentNode.val + " -> ");
            currentNode = currentNode.next;
        } 
        System.out.println("NULL");  
    }

    public static void main(String[] args) {
        RemoveNthNodeInList solution = new RemoveNthNodeInList();
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(3);
        list1.next.next.next = new ListNode(4);
        list1.next.next.next.next = new ListNode(5);
        int target1 = 2;

        ListNode removeNthNode1 = solution.removeNthFromEnd(list1, target1);
        printList(removeNthNode1);

        ListNode list2 = new ListNode(1);
        int target2 = 1;

        ListNode removeNthNode2 = solution.removeNthFromEnd(list2, target2);
        printList(removeNthNode2);
    }

}
