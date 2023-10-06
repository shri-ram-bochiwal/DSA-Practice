# Approach

- Start by taking an input string A.

- Convert the input string A into an array of characters, which we call ar.

- Initialize a loop to iterate through each character in the ar array.

- For each character in the array:

    - Check if it is an uppercase letter by comparing its ASCII value with the range of uppercase letters ('A' to 'Z').
    
    - If the character is uppercase:

        - Convert it to lowercase by adding 32 to its ASCII value. This is because the ASCII values of uppercase letters are consecutive, so adding 32 shifts them to their corresponding lowercase ASCII values.

    - If the character is not uppercase (i.e., it's a lowercase letter):
        - Convert it to uppercase by subtracting 32 from its ASCII value. Again, this is because the ASCII values of lowercase letters are consecutive, so subtracting 32 shifts them to their corresponding uppercase ASCII values.

    - If the character is not a letter (i.e., it's not in the range of 'A' to 'Z'), leave it unchanged.

- After processing all characters in the ar array, you will have a modified array where the case of letters has been toggled, and non-letter characters remain the same.
 
- Convert the modified character array ar back into a string.

- Return the modified string as the final result.


**Time Complexity** : O(N)

**Space Complexity** : O(N)