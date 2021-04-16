n = int(input())
data = list(input().split())

x = 1
y = 1

for move in data:
    if move == 'R':
        y += 1
        if y > n:
            y = n
    elif move == 'L':
        y -= 1
        if y <= 0:
            y = 1
    elif move == 'U':
        x -= 1
        if x <= 0:
            x = 1
    elif move == 'D':
        x += 1
        if x > n:
            x = n

print(x, y)