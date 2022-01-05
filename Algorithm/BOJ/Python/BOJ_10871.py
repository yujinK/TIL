# n = int(input().split()[1])
# a = list(map(int, input().split()))

# for i in a:
#     if i < n:
#         print(i, end=' ')

n, x = map(int, input().split())
score = [i for i in input().split() if int(i) < x]
print(' '.join(score))