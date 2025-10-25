[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21285908)
# Instructions  

1. Write a function that returns the sum of the digits of an integer.
int sumOfDigits(int x);
If x is 234, the function should return 2 + 3 + 4, that is, 9.
If x is 12, the function should return 1 + 2, which is 3.
If x is 39, the function should return 12.
If x is negative, ignore the minus sign. For example, -12 and 12 both return 3.
Use recursion.

Hints:

- The base case is a number between 0 and 9.
- If x is negative, just multiply it by -1 as soon as you enter the function.
- For the recursive call, consider how computing the values `x/10` and `x%10` might be useful.

2. Find the product of the integers from 1 through n and return it (i.e. factorial function). If n is zero, return 1. If n is negative, return 0. Name the function factorial(int). Use recursion.
