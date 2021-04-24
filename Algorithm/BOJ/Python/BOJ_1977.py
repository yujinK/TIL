import math

m = int(input())
n = int(input())
min = n
sum = 0

for i in range(m, n + 1):
    sqrt = int(math.sqrt(i))
    if sqrt * sqrt == i:
        sum += i
        if i < min:
            min = i
            
if min == n:
    print(-1)
else:
    print(sum, min, sep='\n')