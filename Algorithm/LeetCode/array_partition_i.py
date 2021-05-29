nums = [1, 4, 3, 2]
# nums.sort()

# sum = 0
# for i in range(0, len(nums), 2):
#     sum += nums[i]

# print(sum)

print(sum(sorted(nums)[::2]))