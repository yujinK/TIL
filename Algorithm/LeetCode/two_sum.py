nums = [0, 4, 3, 0]
target = 0

left, right = 0, len(nums) - 1
while not left == right:
    if nums[left] + nums[right] > target:
        right -= 1
    elif nums[left] + nums[right] < target:
        left += 1
    else:
        print([left, right])
        break