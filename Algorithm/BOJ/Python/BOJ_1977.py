m = int(input())
n = int(input())
arr = [i * i for i in range(1, 101) if m <= i * i <= n]


print("%d\n%d"%(sum(arr), arr[0])) if arr else print(-1)