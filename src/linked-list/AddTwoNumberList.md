# Approach 1st

- First, you create two dummy nodes - dummy and p.
- The pointers p and dummy initially point to the first node.
- Then, you start a while loop that runs as long as there is at least one node in either A or B or there is a carry left to add.
- Inside the loop, you add the values of the current nodes of A and B to the carry.
- Then, you create a new node for the result, where the value is obtained by taking the modulo of the carry with 10.
- You update the carry by dividing it by 10 so that its value can be used for the next node.
- Update the pointer p to point to the new node, which becomes the next node of the result linked list.
- Finally, return the next node of the dummy node, which is the result linked list.




# Approach 2nd

- First, the given linked lists A and B are reversed so that they can be traversed in the right order.
- Then, you need to sum the specific elements of each node, which involves adding the corresponding digits in the same place value. During this addition, there might be a carry that needs to be passed to the next addition.
- As you perform the addition, you create a new node for each sum and build a new linked list with these nodes.
- Finally, if there is any carry left after the addition, you add it as a new node separately.
- In the end, you reverse the new linked list to obtain the correct result.