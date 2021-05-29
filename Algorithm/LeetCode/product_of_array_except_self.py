import math

nums = [1, 2, 3, 4]

out = [1] * len(nums)
p = 1
for i in range(0, len(nums)):
    out[i] = p
    p = p * nums[i]

p = 1
for i in range(len(nums) - 1, -1, -1):
    out[i] = out[i] * p
    p = p * nums[i]

print(out)