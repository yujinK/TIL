t = int(input())

for _ in range(t):
    r, s = input().split()
    for sub_s in s:
        print(int(r) * sub_s, end='')

    print()