x = int(input())
y = int(input())

# if x > 0:
#     if y > 0:
#         print(1)
#     else:
#         print(4)
# elif x < 0:
#     if y > 0:
#         print(2)
#     else:
#         print(3)

if x > 0:
    print(1 if y > 0 else 4)
elif x < 0:
    print(2 if y > 0 else 3)