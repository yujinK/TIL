import math

nums = [1, 2, 3, 4]

left_prod = []
right_prod = []

for i in range(len(nums) - 1):
    if i == 0:
        left_prod.append(1)
        left_prod.append(nums[i])
    else:
        left_prod.append(left_prod[i] * nums[i])

for i in range(len(nums) - 1, 0, -1):
    if i == len(nums) - 1:
        right_prod.append(1)
        right_prod.append(nums[i])
    else:
        right_prod.append(right_prod[len(nums) - i - 1] * nums[i])

result = []
for i in range(len(nums)):
    result.append(left_prod[i] * right_prod[len(nums) - i - 1])

print(result)