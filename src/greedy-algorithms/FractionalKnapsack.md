# Approach

**Creating the Pair Class**:

- You define a class Pair that represents an item with three attributes: val (value of the item), wt (weight of the item), and vpk (value-to-weight ratio of the item).

**Initializing the Items Array**:

- Given two arrays A and B representing values and weights of N items respectively, you create an array of Pair objects called arr to store these items.

**Calculating Value-to-Weight Ratios**:

- In the Pair constructor, you compute the vpk (value-to-weight ratio) of each item by dividing its value by its weight.

**Sorting Items by Value-to-Weight Ratio**:

- You sort the arr array of Pair objects in descending order based on the value-to-weight ratio (vpk) using a custom comparator. This step helps prioritize items with higher value-to-weight ratios.

**Knapsack Filling**:

- Initialize a variable ans to keep track of the total value obtained in the knapsack.

- Starting from the item with the highest value-to-weight ratio (largest vpk), you iterate through the sorted arr array in reverse order.
- For each item p:
    
    - If the weight of the item p is less than or equal to the remaining knapsack capacity C, you can fully include the item in the knapsack. So, you add its value (val) to the ans and subtract its weight (wt) from the remaining capacity C.

    - If the weight of the item p is greater than the remaining capacity C, you can include a fraction of the item to maximize the value. You add the product of the remaining capacity C and the value-to-weight ratio (vpk) of the item to the ans. Then, you set C to 0 to indicate that the knapsack is full, and break out of the loop.

**Returning the Result**:

- After processing all items, you convert the calculated ans to an integer value representing the maximum total value obtainable, multiplied by 1000 and divided by 10. This operation is meant to round down the result to the nearest tenth.

**Time Complexity** : O(N logN)

**Space Complexity** : O(N)