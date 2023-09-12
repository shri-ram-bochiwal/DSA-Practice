# Approach

- Create a Graph: Initialize an ArrayList of ArrayLists called graph to represent the graph of courses and prerequisites. Initialize indegree array to store the indegree (the number of prerequisites) for each course.

- Build the Graph: Loop through the B and C arrays, where B[i] is a prerequisite for C[i]. Add the edge from B[i] to C[i] in the graph to represent the prerequisite relationship.

- Calculate Indegree: Loop through the graph to calculate the indegree of each course. For each course, count the number of incoming edges (prerequisites) by incrementing indegree[nbr] for each neighbor nbr.

- Topological Sorting: Use a PriorityQueue (pq) to perform topological sorting of the courses. Initialize count to keep track of the number of courses completed.

- Initialize PriorityQueue: Loop through the courses and add those with an indegree of 0 to the pq because these can be the starting points for completing courses.

- Topological Sort: While pq is not empty, remove a course rem from pq, add it to the ans array to keep track of the order of courses completed, increment count, and update the indegree of its neighbors. If any neighbor's indegree becomes 0, add it to the pq for further processing.

- Check Completion: After the loop, check if the count of completed courses is equal to the total number of courses A. If they are equal, return 1 because it's possible to finish all courses. Otherwise, return 0 because not all courses can be completed due to dependencies or cycles in the graph.

**Time Complexity** : O(A + B)

**Space Complexity** : O(A + B)