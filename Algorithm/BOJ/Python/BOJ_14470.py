data = []
for _ in range(5):
    data.append(int(input()))

time = 0
if data[0] < 0:
    time = abs(data[0]) * data[2] + data[3]
    data[0] = 0

time += (data[1] - data[0]) * data[4]
print(time)