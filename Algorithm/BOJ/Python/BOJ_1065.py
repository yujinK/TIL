# N = int(input())

# def count_hansoo(num):
#     if num < 100:
#         return True
    
#     diff = 0
#     prev = 0
#     for i, value in enumerate(str(num)):
#         if i == 0:
#             prev = int(value)
#             continue
#         elif i == 1:
#             diff = prev - int(value)
#             prev = int(value)
#         else:
#             if diff != prev - int(value):
#                 return False
#             else:
#                 diff = value
        
        
#     return True
        
        
    
# count = 0
# for num in range(1, N+1):
#     if count_hansoo(num):
#         count += 1
        
# print(count)

N = int(input())

def count_hansoo(num):
    if num < 100:
        return True

    if (num//100 - num//10%10) == (num//10%10 - num%100%10):
        return True
    
    return False
    
count = 0
for num in range(1, N+1):
    if count_hansoo(num):
        count += 1
        
print(count)