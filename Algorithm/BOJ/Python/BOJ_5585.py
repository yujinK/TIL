pay = int(input())
change = 1000 - pay
coin = [500, 100, 50, 10, 5, 1]
count = 0

for c in coin:
    if change == 0:
        break
    count += change // c
    change %= c

print(count)