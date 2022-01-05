n = int(input())
count = 0
num = -1

while num != n:
    if num == -1:
        num = n
    
    num = (num % 10) * 10 + (num // 10 + num % 10) % 10
    count += 1
        
print(count)