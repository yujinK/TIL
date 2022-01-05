# alphabets = [0 for i in range(26)]

# str_input = input().upper()

# for str in str_input:
#     alphabets[ord(str) - 65] += 1
    
# max_num = max(alphabets)
# count_num = alphabets.count(max_num)
# if count_num > 1:
#     print("?")
# else:
#     print(chr(alphabets.index(max_num) + 65))

s, a = input().upper(), []
for i in range(65, 123):
    a.append(s.count(chr(i)))
print('?' if a.count(max(a)) > 1 else chr(a.index(max(a)) + 65))
