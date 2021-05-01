s = ["h", "e", "l", "l", "o"]
print(s)

for i in range(len(s)//2):
    temp = s[i]
    s[i] = s[len(s) - 1 - i]
    s[len(s) - 1 - i] = temp

print(s)