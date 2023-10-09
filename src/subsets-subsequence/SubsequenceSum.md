# Approach

- Begin by defining a function called "solve" that takes two arguments: an integer array A and an integer B.

- Calculate the length of the array A and store it in a variable called "n."

- Compute the total number of possible subsets of A using the formula 2^n, where n is the length of A. Store this value in a variable called "tcs" (total possible subset count).

- Start a loop that iterates from 1 to tcs (excluding tcs) using the variable "i." This loop will be used to generate all possible subsets of A.

- Within the loop, initialize a variable "sum" to keep track of the sum of elements in the current subset.

- Use another loop with the variable "j" to go through each element of the array A.

- Check if the j-th element of A should be included in the current subset by performing a bitwise operation. Specifically, check if the j-th bit of the variable "i" is set to 1, indicating that the j-th element is part of the subset. If the condition "(i | (1 << j)) == i" is true, add the j-th element to the "sum."

- After the inner loop completes, check if the "sum" of elements in the current subset equals the target value B. If it does, return 1 to indicate that a subset with the desired sum has been found.

- If, after iterating through all possible subsets, no subset with the sum B is found, return 0 to indicate that there is no such subset in the array that meets the criteria.

**Time Complexity** : O(2^n)

**Space Complexity** : O(1)