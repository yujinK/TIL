nums = [0, 4, 3, 0]
target = 0

nums_map = {}
for i, num in enumerate(nums):
    if target - num in nums_map:
        print([nums_map[target - num], i])
    nums_map[num] = i