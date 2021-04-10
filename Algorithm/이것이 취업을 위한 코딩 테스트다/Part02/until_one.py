n, k = map(int, input().split())
result = 0

while n > 1:
  if n % k == 0:
    n = n // k
  else:
    n -= 1

  result += 1

print(result)


# N이 K의 배수가 되도록 효율적으로 한 번에 빼는 방식
# n, k = map(int, input().split())
# result = 0

# while True:
#     target = (n // k) * K
#     result += (n - target)
#     n = target

#     if n < k:
#         break
#     result += 1
#     n //= k

# result += (n - 1)
# print(result)