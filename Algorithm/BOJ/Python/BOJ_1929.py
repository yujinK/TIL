import math

m, n = map(int,input().split())
nums = [True for _ in range(n+1)]
nums[1] = False

for i in range(2, int(math.sqrt(n))+1):
    if nums[i]:
        for j in range(i*2, n+1, i):
            nums[j] = False
            
for i in range(m, n+1):
    if nums[i]:
        print(i)