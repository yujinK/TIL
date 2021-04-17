n = int(input())

result = 0
for hour in range(n + 1):
    for minute in range(60):
        for second in range(60):
            if '3' in list(str(hour)) or '3' in list(str(minute)) or '3' in list(str(second)):
                result += 1


print(result)