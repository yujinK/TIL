n = int(input())
data = list(map(int, input().split()))
sum_data = set()

for i in data:
  sum_data.add(i)

from itertools import combinations
pick = 2

while pick <= len(data):
  comb = list(combinations(data, pick))
  for i in comb:
    sum_data.add(sum(i))
  pick += 1

result = 1
while True:
  if result not in sum_data:
    break
  result += 1

print(result)