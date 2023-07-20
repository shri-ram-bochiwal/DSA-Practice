# Approach 1st

- In this code, we first initialize two pointers, slow and fast, both starting
from the node A. They will move together, where fast moves two nodes at a
time and slow moves one node at a time.
- The purpose of this step is to find the middle node of the linked list. When
the fast pointer reaches the end of the list or becomes null, the slow
pointer will be at the middle of the list. This is because when fast moves
two nodes at a time, slow moves half of that, and hence it effectively
reaches the middle node.
- After finding the middle node using the slow pointer, we reverse the second
half of the linked list using the reverseList function. This function
iteratively reverses the list, where we keep track of the previous node
(prev), current node (current), and next node (nextNode) while traversing the
list.
- We then have two pointers, tmp1 and tmp2, where tmp1 points to the start of
the original linked list (A) and tmp2 points to the start of the reversed
half (reverseHead).
- In the next step, we compare the values of nodes pointed by tmp1 and tmp2. If
any pair of nodes has different values, the linked list is not a palindrome,
and we return 0. Otherwise, we keep moving both pointers until one of them
becomes null.
- If the traversal is successful and all values match, the linked list is a
palindrome, and we return 1.

**Time complexity**: O(n)

**Space Complexity**: O(1)


# Approach 2nd :


- First, we initialize a reversHead node as null, which will be used to store
the reversed linked list.
- We then start traversing the original linked list (A) using the current
pointer.
- During the traversal, we create a new node tmp for each node in the original
linked list, copying the value of the current node into tmp.
- We set the next of tmp to reversHead, effectively adding the new node at the
beginning of the reversed list.
- Finally, we update reversHead to point to the newly added node (tmp).
- After the traversal, reversHead points to the head of the reversed linked
list, which effectively reverses the original linked list.
- We then have two pointers, tmp1 and tmp2, where tmp1 points to the start of
the original linked list (A) and tmp2 points to the start of the reversed
linked list (reversHead).
- In the next step, we compare the values of nodes pointed by tmp1 and tmp2. If
any pair of nodes has different values, the linked list is not a palindrome,
and we return 0.
- Otherwise, we keep moving both pointers until one of them becomes null.
- If the traversal is successful and all values match, the linked list is a
palindrome, and we return 1.

**Time Complexity**: O(n)

**Space Complexity**: O(n);
