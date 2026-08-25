# Spiral Video
- In this problem the time complexity should be `O(1)` ie. `constant`
- Here we can actually see a patten by finding the vertical and horizontal lines in an increasing order.
- If you carefully observe we can see that the vertical lines are increasing from bottom to top, while the horizontal lines are increasing from left to right.
- Now How to classify a cell that belongs to horizontal or vertical.
  - For Vertical it is x <= y 
  - For Horizontal it is y > x

for x<= y : 
  if y is odd then ans = y^2 - (x-1)
  else if y is even then ans = (y-1)^2 + x
for x > y :
  if x is even then ans = x^2 - (y-1)
  else if x is odd then ans = (x-1)^2 + y
