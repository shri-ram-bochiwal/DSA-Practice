# Appraoch 1st

- Initialization: The function solve takes two input strings, A and B, and initializes several variables:

    - n: Represents the length of string A.
    
    - m: Represents the length of string B.

    - count: Initializes a counter to keep track of the number of occurrences of string B within string A.

- Iterate Through String A: The code uses a for loop that iterates through string A. The loop variable i controls the starting position of the potential substring match within A. It ranges from 0 to n - m, ensuring that there are enough characters in A for a potential match.

- Character Matching: At each position i, the code checks whether the character at index i in string A matches the first character of string B (i.e., B.charAt(0)).

- Substring Comparison: If there's a match in the first character, the code enters a nested loop. It initializes two pointers, k and l, which track the positions in A and B, respectively. The code then enters another loop that compares characters in A and B at corresponding positions. If any characters don't match, it sets a flag to false and exits the loop.

- Count Occurrences: If the flag remains true after the inner loop, it signifies that the substring from index i to i + m in A matches the entire string B. The count is incremented to reflect this occurrence.

- Continue Searching: The code continues the outer loop to check for additional occurrences of B in A.

- Return Count: Finally, the function returns the count, which indicates the total number of times string B appears as a substring in string A.

**Time Complexity** : O(N*M)

**Space Complexity** : O(1)


# Approach 2nd

- Initialization:

    - count is initialized to 0 to keep track of the number of occurrences.

    - textLength is calculated as the length of textA.

    - patternLength is calculated as the length of patternB.

- Iterate Through Text A:

    - The code uses a for loop that iterates through textA. The loop variable i controls the starting position of the potential substring match within textA.

    - The loop runs from 0 to textLength - patternLength to ensure that there are enough characters in textA for a potential match.

- Substring Comparison:

    - At each position i, the code extracts a substring of textA starting at index i and ending at index i + patternLength. This substring corresponds to the same length as patternB.

    - The code then checks if this extracted substring is equal to patternB. If it's equal, it implies that a match is found.

- Count Occurrences:

    - If the extracted substring matches patternB, the count is incremented to indicate that a match has been found.

- Continue Searching:

    - The loop continues to check for additional occurrences of patternB in textA by shifting the starting position.

- Return Count:

    - Finally, the function returns the count, which represents the total number of times patternB appears as a substring in textA.


**Time Complexity** : O(N*M)

**Space complexity** : O(1)

