number = [int(i) for i in input()]
result = number[0]

for i in range(1, len(number)):
    if number[i-1] == 0:
        result += number[i]
    else:
        result *= number[i]

print(result)


# 답안
# data = input()

# result = int(data[0])

# for i in range(1, len(data)):
#     num = int(data[i])
#     if num <= 1 or result <= 1:
#         result += num
#     else:
#         result *= num

# print(result)