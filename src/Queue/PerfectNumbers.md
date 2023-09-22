# Approach 

- Initialize a queue (qu) to store strings, and add the strings "1" and "2" to it. These strings represent the starting points for generating perfect numbers.

- Initialize an empty string ans to store the result and an integer i to keep track of the count of perfect numbers found.

- Start a while loop that continues until you have found the Ath perfect number.

- Inside the loop:

    - Remove the front element from the queue (qu) and store it in the rem variable.

    - Create a StringBuilder object sb from rem to help with reversing the string.

    - Generate two new strings s1 and s2 by appending "1" and "2" to the rem string, respectively.
    
    - Add both s1 and s2 to the queue to explore further possibilities.

- Reverse the rem string using the StringBuilder (sb) and store it in the rev variable.

- Create a new string res by concatenating rem and rev. This represents a possible perfect number candidate.

- Update the ans variable with the value of res.

- Increment the i variable to keep track of the number of perfect numbers found.

- Finally, return the ans string, which should contain the Ath perfect number that meets the specified conditions.

**Time Complexity** : O(A)

**Space Complexity** : O(2^A)