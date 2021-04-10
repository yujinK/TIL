n, m = map(int, input().split())
min_card = [0] * n

for i in range(n):
  data = list(map(int, input().split()))
  min_card[i] = min(data)

print(max(min_card))

# 리스트 없이 그냥 바로 찾기
# n, m = map(int, input().split())

# result = 0
# for i in range(n):
#     data = list(map(int, input().split()))
#     min_value = min(data)
#     result = max(result, max_value)

# print(result)
