# HashMap Approach

- Initialize a HashMap called hm to store the frequency count of characters.

- Initialize a StringBuilder called sb to build the result string.

Loop through the characters of the input string A using a for loop.

- For each character ch in the input string, update its frequency count in the hm HashMap using hm.put(ch, hm.getOrDefault(ch, 0) + 1). This code increments the count of character ch by 1 in the HashMap. If the character is not already in the HashMap, it defaults to 0.

- After counting the frequencies, iterate through the input string A again using a for loop.

- For each character ch in the input string, check if its frequency in the hm HashMap is equal to 1 using if(hm.get(ch) == 1). If the frequency is 1, it means the character appears only once in the input string.

- If the character's frequency is 1, append it to the sb StringBuilder using sb.append(ch).

- Finally, return the result string obtained from the sb StringBuilder using sb.toString().

**Time Complexity** : O(N)

**Space Complexity** : O(N)



# Stack Appraoch

- Initialize an empty Stack called st to store characters without duplicates and an index variable i to traverse the input string.

- Iterate through the characters of the input string str1 using a while loop.

- Check if the Stack st is empty or if the top of the stack is not equal to the current character. If true, add the current character to the stack and increment the index i. This step ensures that only unique characters are added to the stack.

- If the top element of the stack is equal to the current character (indicating an adjacent duplicate), pop the top element from the stack and increment the index i to skip the duplicate.

- After processing all characters, the Stack st will contain unique characters in reverse order.

- Construct a short_String by popping characters from the stack and appending them to the beginning of the string until the stack is empty.

- If the stack is empty, return "Empty String" as there are no unique characters.

- If the stack is not empty, return the short_String, which contains unique characters with adjacent duplicates removed while preserving the order of the first occurrence of each character.

**Time Complexity** : O(N)

**Space Complexity** : O(N)





