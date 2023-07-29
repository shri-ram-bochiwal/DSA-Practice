# Approach

- Create a new dummyNode and place it at the beginning of the original list. The dummyNode helps us handle the swapping of the first two nodes without worrying about the original head.
- Set previousNode to the dummyNode.
- Set currentNode to the original head of the list.
- While both currentNode and currentNode.next are not null (i.e., there are at least two more nodes left to process), perform the following actions:

    **a.** Move newNode to currentNode.next, pointing to the second node that we want to swap with currentNode.

    **b.** Move tmpNode to newNode.next, which will hold the reference to the next node for the next iteration.

    **c.** Update the next pointer of previousNode to point to newNode, making the second node the new previous node.

    **d.** Update the next pointer of newNode to point to currentNode, effectively swapping the two nodes.

    **e.** Update the next pointer of currentNode to point to tmpNode, maintaining the connection to the next pair of nodes.

    **f.** Update previousNode to currentNode, preparing it for the next iteration as it will be the previous node for the next pair.

    **g.** Update currentNode to tmpNode, preparing it for the next iteration as it will be the current node in the next pair.

- Finally, return the dummyNode.next, which will be the head of the swapped list.

**Time Complexity** : O(N)

**Space Complexity** : O(1)