# Approach

- Base Case: If the input string A is null or has a length less than or equal to 1, we consider it as already reversed, so we return A as it is.

- Recursive Case: If the input string A has a length greater than 1, we do the following:

    - Get the last character of the string A using A.charAt(A.length() - 1). This character will be the first character in the reversed string.

    - Recursively call the reverse method on the substring of A that excludes the last character by using. substring(0, A.length() - 1). This recursive call will return the reversed version of the substring.

    - Combine the last character with the reversed substring, effectively reversing the entire string.

    - The reversed string is built up through a series of recursive calls, and the final reversed string is returned.


**Time Complexity** : O(N)

**Space Complexity** : O(N)