# Approach

- Create a class called CycleInUndirectedGraph to encapsulate the cycle detection logic.

- In the cycleInUndirected method, you will:

    - Initialize an ArrayList of ArrayLists called graph to represent the adjacency list of the graph.

    - Iterate through each vertex from 1 to A and add an empty ArrayList for each vertex to initialize the graph structure.

    - Iterate through the edges provided in the 2D array B and add the appropriate edges to the graph by adding each vertex to the adjacency list of the other vertex.

    - Initialize a boolean array called visited to keep track of visited vertices.

    - Iterate through each vertex from 1 to A and for each unvisited vertex, call the hasCycle method to check if there is a cycle starting from that vertex. If a cycle is found, return 1.

- The hasCycle method is a recursive DFS function that checks for cycles in the graph:

    - Mark the current node as visited.

    - For each neighbor (nbr) of the current node:
        - If the neighbor is not visited, recursively call hasCycle on the neighbor.

        - If the neighbor is visited and is not the parent of the current node (to avoid considering the edge back to the parent as a cycle), return true to indicate the presence of a cycle.

        - If no cycle is found after exploring all neighbors, return false.

- In the main method:

    - Create two sets of input data (input1 and input2) with the corresponding number of vertices (vartax1 and vartax2).

    - Create an instance of the CycleInUndirectedGraph class.

    - Call the cycleInUndirected method for both sets of input data and print the results.

- Run the program to test the cycle detection algorithm on two different graphs and print the results.


**Time Complexity** : O(V + E)

**Space Complexity** : O(V + E)