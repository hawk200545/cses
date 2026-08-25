# Two Knights

Time limit: 1.00 s
Memory limit: 512 MB

Your task is to count for k=1,2,\ldots,n the number of ways two knights can be placed on a k \times k chessboard so that they do not attack each other.
Input
The only input line contains an integer n.
Output
Print n integers: the results.
Constraints

1 \le n \le 10000

Example
Input:
8

Output:
0
6
28
96
252
550
1056
1848

---
Approach : 
- Here we need to come up with a pattern maths formula.
- if k*k is chessboard then, then the number of ways we can place two knights such that, they don't attack each other is given by, 
 ans = k^2(k^2-1)/2 - 4(k-1)(k-2)
