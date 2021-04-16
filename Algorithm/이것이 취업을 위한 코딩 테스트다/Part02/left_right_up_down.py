# n = int(input())
# data = list(input().split())

# x = 1
# y = 1

# for move in data:
#     if move == 'R':
#         y += 1
#         if y > n:
#             y = n
#     elif move == 'L':
#         y -= 1
#         if y <= 0:
#             y = 1
#     elif move == 'U':
#         x -= 1
#         if x <= 0:
#             x = 1
#     elif move == 'D':
#         x += 1
#         if x > n:
#             x = n

# print(x, y)

n = int(input())
x, y = 1, 1
plans = input().split()

dx = [0, 0, -1, 1]
dy = [-1, 1, 0, 0]
move_type = ['L', 'R', 'U', 'D']

for plan in plans:
    for i in range(len(move_type)):
        if plan == move_type[i]:
            nx = x + dx[i]
            ny = y + dy[i]
    if nx < 1 or ny < 1 or nx > n or ny > n:
        continue
    x, y = nx, ny

print(x, y)