n, m = map(int, input().split())
data = list(map(int, input().split()))

from itertools import combinations
pick = list(combinations(data, 2))

result = 0
for i in pick:
  if i[0] != i[1]:
    result += 1

print(result)