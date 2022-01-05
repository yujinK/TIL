import sys

input()
m = [int(i) for i in sys.stdin.read().split()]

print(min(m), max(m))