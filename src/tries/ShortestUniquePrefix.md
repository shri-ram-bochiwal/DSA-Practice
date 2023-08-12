# Approach 1st

- TrieNode Class Definition:

    - Define a TrieNode class with two member variables:

        - count: An integer to keep track of the number of times a character has been encountered at this node or its descendants.

        - map: A hash map to store the children nodes where the key is a character and the value is a reference to the child TrieNode.
  
    - Initialize count to 0 and create an empty map in the constructor.

- Insert Function:

    - Create a function named insert that takes a string A and a TrieNode called root.
    
    - Iterate through each character ch in the string A.
    
    - If the character ch is already present in the current node's map, update tmp (current node) to the existing child node, and increment the count of that child node.

    - If the character ch is not present, create a new TrieNode called newNode, add it to the current node's map with the character ch, update tmp to newNode, and increment the count of newNode.

- Search Function:

    - Create a function named search that takes a string A and a TrieNode called root.

    - Initialize temp as the root node and create an empty StringBuilder called sb.

    - Iterate through each character ch in the string A.
 
    - If the character ch is present in the current node's map, check if the count of the current node is 1. If so, break the loop to ensure the shortest unique prefix is found.

    - Otherwise, append the character ch to sb, update temp to the child node associated with ch in the map.

- Prefix Function:

    - Create a function named prefix that takes an array of strings A.

    - Initialize an array result to store the resulting prefixes.

    - Create a TrieNode called root.

    - Iterate through each string s in the array A and insert it into the trie using the insert function.

    - Iterate through each string s in the array A and find the shortest unique prefix for each string using the search function. Store the result in the result array.

- Main Function:

    - Inside the main function:

    - Create instances of the ShortestUniquePrefix class and input arrays input1 and input2.

    - Call the prefix function on each input array and print the results using Arrays.toString().


**Time Complexity** : O(N*K)

**Space Complexity** : O(N*K)

# Approach 2nd

- Initialize an array prefixes to store the shortest unique prefixes for each word.

- Iterate through each word in the input array using a for loop with index i.

- For each word, initialize an empty string prefix to store the current prefix.

- Use another for loop with index j to iterate from 1 to the length of the current word.

    - In each iteration, create a currentPrefix by taking the substring of the word from index 0 to j.

    - Initialize a boolean variable unique as true to track if the current prefix is unique.

- Use another nested for loop with index k to iterate through all words in the array to compare with the current word.

    - If the current word at index k is not the same as the word being considered (i != k) and it starts with the currentPrefix, then the prefix is not unique. Set unique to false and break from the loop.

- If unique is still true after the inner loop, set the prefix to the currentPrefix and break from the middle loop.

- Store the found prefix for the current word in the prefixes array at index i.

- After iterating through all words, return the prefixes array containing the shortest unique prefixes for each word.

**Time Complexity** : O(N*K^2)

**Space Complexity** : O(N)