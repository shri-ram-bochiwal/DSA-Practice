# Approach

**TrieNode Class** : Define a nested class TrieNode that represents a node in the Trie. Each node contains an integer count to track the number of strings passing through that node, and a map that maps characters to child TrieNodes.

**Insertion** : Implement the insert method to insert a string into the Trie. For each character in the string, check if the character exists as a key in the current node's map. If it does, move to the next node and increment its count. If not, create a new node for the character, add it to the map, move to the new node, and increment its count.

**Prefix Search** : Implement the searchPfxCount method to search for the count of strings with a given prefix in the Trie. Traverse the Trie according to the characters in the prefix. If a character is found, move to the corresponding child node. If the character is not found at any point, return 0 since the prefix doesn't exist in the Trie.

**Solve Method** : Implement the solve method that processes a list of strings (B) based on corresponding values (A). Initialize an empty ArrayList ans to store the results. Create a Trie root node. Iterate through the B list and for each string:

- If the corresponding value in A is 0, insert the string into the Trie using the insert method.

- If the value in A is 1, search for the prefix count using the searchPfxCount method and add the result to the ans list.

**Return Result** : Return the ans ArrayList, which contains the counts of strings with matching prefixes based on the values in A.


**TIme Complexity** : O(M*N)

**Space Complexity** : O(N)