n = int(input())

for _ in range(n):
    data = input().split()
    scores = list(map(float, data[1:]))
    avg = sum(scores) / len(scores)
    
    above = 0
    for score in scores:
        if score > avg:
            above += 1
            
    print(f'{(above / len(scores) * 100):.3f}%')