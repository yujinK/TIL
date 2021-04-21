data = input()
alphabet = []
decimal = 0

for d in data:
    if d.isdecimal():
        decimal += int(d)
    else:
        alphabet.append(d)

alphabet.sort()
print(''.join(alphabet), decimal, sep="")