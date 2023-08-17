# Approach 1st

- The process involves a while loop that continues executing as long as A is greater than 0. Inside the loop, the code performs two actions in each iteration:

- It calculates the remainder of A when divided by 5 using the expression A % 5 and adds this remainder to the current value of ans.

- It updates the value of A by dividing it by 5 using the expression A = A / 5. This step essentially shifts the number to the right, treating it as if it were represented in a base-5 system.


# Approach 2nd

- Initialize totalCoins to keep track of the minimum number of coins required to pay the cost.

- Initialize coinValue with the highest available coin value (e.g., coinValue = 15625).

- Start a loop that continues as long as the remaining cost (A) is greater than 0.

- Inside the loop:
    
    **a**. Determine how many coins of the current coinValue can be used by dividing A by coinValue. Add this count to totalCoins.

    **b**. Update A to the remainder after using the coins, which represents the remaining cost.

    **c**. Reduce the value of coinValue by dividing it by 5. This is done to move to the next lower coin value in the series.

- Once the loop finishes, the value of totalCoins will represent the minimum number of coins needed to pay the exact cost of the item.

- Output the result by printing "Minimum number of coins required: " followed by the value of totalCoins.