nums = [0, 4, 3, 0]
target = 0

nums_map = {}
for i, num in enumerate(nums):
    nums_map[num] = i

for i, num in enumerate(nums):
    if target - num in nums_map and i != nums_map[target - num]:
        print([i, nums_map[target - num]])
        break