nums = [0, 4, 3, 0]
target = 0

result = []
for i in range(0, len(nums) - 1):
    flag = False
    for j in range(i + 1, len(nums)):
        if nums[i] + nums[j] == target:
            result = [i, j]
            flag = True
            break

    if flag:
        break

print(result)