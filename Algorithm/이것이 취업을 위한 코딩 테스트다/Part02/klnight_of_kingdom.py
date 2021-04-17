now = list(input())
x = ord(now[0]) - 96
y = int(now[1])

dx = [2, 2, -2, -2, -1, 1, -1, 1]
dy = [-1, 1, -1, 1, -2, -2, 2, 2]

count = 0
for i in range(8):
    nx = x + dx[i]
    ny = y + dy[i]

    if nx < 1 or ny < 1 or nx > 8 or ny > 8:
        continue
    count += 1

print(count)

# 해설 풀이 방법
# input_data = input()
# row = int(input_data[1])
# column = int(ord(input_data[0])) - int(ord('a')) + 1

# steps = [(-2, -1), (-1, -2), (1, -2), (2, -1), (2, 1), (1, 2), (-1, 2), (-2, 1)]

# result = 0
# for step in steps:
#     next_row = row + step[0]
#     next_column = column + step[1]
#     if next_row >=1 and next_row <= 8 and next_column >= 1 and next_column <= 8:
#         result += 1

# print(result)