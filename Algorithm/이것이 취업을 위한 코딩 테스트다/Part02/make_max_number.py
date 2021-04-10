n, m, k = map(int, input().split())
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


# 수학적 아이디어 사용
# n, m, k = map(int, input().split())
# data = list(map(int, input().split()))

# data.sort()
# first = data[n-1]
# second = data[n-2]

# count = int(m / (k + 1)) * k
# count += m % (k + 1)

# result = 0
# result += count * first
# result += (m - count) * second

# print(result)