# Approach

- You create two HashMaps, Afreq and Bfreq, to store the frequency of characters in strings A and B, respectively.

- Initialize variables n and m to store the lengths of strings A and B, and initialize counter to m. This counter keeps track of how many characters from string B are needed to form a valid window in string A.

- Iterate through string B and populate the Bfreq HashMap with the character frequencies.

- Initialize pointers start and end to 0, right to Integer.MAX_VALUE, and left to 0. These pointers will be used to keep track of the sliding window.

- Enter a while loop that continues until end reaches the end of string A.

- Inside the loop, get the character ch at the end position of string A. Check if ch is present in Bfreq. If yes, decrement the count of ch in Bfreq and decrement counter if the count becomes non-negative.

- Enter another while loop that continues while counter is 0 and start is less than or equal to end. This loop helps in finding the minimum window.

- Calculate the current window size curr as end - start.

- If the current window size is smaller than the previously recorded minimum window (right - left), update left and right pointers accordingly.

- Get the character st at the start position of string A. If st is present in Bfreq, increment the count of st in Bfreq and increment counter if the count becomes positive.

- Increment the start pointer to shrink the window from the left side.

- Increment the end pointer to expand the window from the right side.

- After the while loop, check if the right pointer is still equal to Integer.MAX_VALUE. If it is, there was no valid window found, so return an empty string.

- Otherwise, return the substring of string A from the left to right + 1, which represents the minimum window containing all characters from string B in string A.

- In the main function, you test your minWindow method with three different input pairs and print the results.


**Time Complexity** : O(m + n)

**Space Complexity** : O(m)