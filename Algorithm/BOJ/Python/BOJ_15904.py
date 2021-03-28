input_str = input()
ucpc = ["U", "C", "P", "C"]
index = 0

for i in range(len(input_str)):
    if input_str[i] == ucpc[index]:
        index += 1
    if index == 4:
        break

if index == 4:
    print("I love UCPC")
else:
    print("I hate UCPC")