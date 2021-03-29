N = int(input())
time = list(map(int, input().split()))
time.sort()

total = 0
sum_time = 0
for t in time:
    sum_time += t
    total += sum_time

print(total) 