natural_num = set(range(1, 10001))
generated_num = set()

def d(n):
    for i in str(n):
        n += int(i)
        
    generated_num.add(n)
    
for n in range(1, 10001):
    d(n)
    
self_num = sorted(natural_num - generated_num)
for n in self_num:
    print(n)