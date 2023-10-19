# Approach 

- The code defines a method solve that takes an array of strings A as input.

- It uses a stack named st to process the elements in the array.

- The code iterates through each element token in the input array A.

- For each token, it checks if it is an operator by using the isOperator function.

- If the token is an operator, it pops the top two integers from the stack, performs the operation using the performOperator function, and pushes the result back onto the stack.

- If the token is not an operator, it converts the token to an integer and pushes it onto the stack.

- This process continues for all tokens in the array.

- After processing all tokens, the stack should contain the final result of the arithmetic expression.

- The code then pops the result from the stack and returns it as the output of the solve function.

**Time Complexity** : O(N)

**Space Complexity** : O(N + 1)