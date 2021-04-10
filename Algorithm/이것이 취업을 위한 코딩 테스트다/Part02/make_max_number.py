N, M, K = map(int, input().split())
numbers = list(map(int, input().split()))
numbers.sort(reverse=True)

idx = 0
count = 0
result = 0
for i in range(M):
  if count == K:
    idx = 1
    count = 0
  else:
    idx = 0
  result += numbers[idx]
  count += 1

print(result)