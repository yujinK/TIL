score = input()

left_sum = 0
right_sum = 0

for i in range(len(score)//2):
    left_sum += int(score[i])
for i in range(len(score)//2, len(score)):
    right_sum += int(score[i])

if left_sum == right_sum:
    print("LUCKY")
else:
    print("READY")


# 해설
# n = input()
# length = len(n)
# summary = 0

# for i in range(length // 2):
#     summary += int(n[i])

# for i in range(length // 2, length):
#     summary -= int(n[i])

# if summary == 0:
#     print("LUCKY")
# else:
#     print("READY")