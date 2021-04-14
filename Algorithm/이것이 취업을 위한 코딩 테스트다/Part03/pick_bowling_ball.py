n, m = map(int, input().split())
data = list(map(int, input().split()))

from itertools import combinations
pick = list(combinations(data, 2))

result = 0
for i in pick:
  if i[0] != i[1]:
    result += 1

print(result)

# 풀이 방법
# n, m = map(int, input().split())
# data = list(map(int, input().split()))

# array = [0] * 11

# for x in data:
#   array[x] += 1

# result = 0
# for i in range(1, m + 1):
#   n -= array[i]
#   result += array[i] * n

# print(result)