a, b, c, d, e = [int(input()) for _ in range(5)]

time = 0
while a < b:
    if a < 0:
        time += (0 - a) * c
        a = 0
        time += d
    else:
        time += (b - a) * e
        a = b

print(time)