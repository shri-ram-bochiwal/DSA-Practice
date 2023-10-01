# Approach

- Sort the input array A in ascending order to simplify the search for pairs.

- Initialize two pointers, i and j, initially set to 0 and 1, respectively. These pointers will help track the elements in the potential pairs.

- Initialize a count variable to keep track of the number of valid pairs found.

- Enter a loop that continues until the j pointer reaches the end of the array.

- Calculate the difference between the elements pointed to by A[j] and A[i].

- Check several conditions:

    - If i is equal to j, increment j to avoid comparing an element with itself.

    - If the calculated difference is equal to B, increment the count to signify a valid pair has been found, and increment j to continue searching for the next pair. Additionally, skip over duplicate values to avoid counting the same pair multiple times.

    - If the difference is greater than B, increment i to reduce the difference.

    - If the difference is less than B, increment j to increase the difference.

- Continue this process until all pairs in the array have been examined.

- Finally, return the count variable, which represents the count of pairs with the specified difference B.


**Time Complexity** : O(N logN)

**Space Complexity** : O(1)