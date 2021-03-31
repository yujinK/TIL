n = 5
lost = [2, 4]
reserve = [1, 3, 5]

def solution(n, lost, reserve):
    answer = 0
    uniform = [1 for x in range(n+1)]

    for i in reserve:
        uniform[i] += 1

    for i in lost:
        uniform[i] -= 1

    for i in range(1, n+1):
        if uniform[i] == 0:
            if i > 1 and uniform[i-1] > 1:
                answer += 1
                uniform[i-1] -= 1
            elif i < n and uniform[i+1] > 1:
                answer += 1
                uniform[i+1] -= 1
        else:
            answer += 1

    return answer

print(solution(n, lost, reserve))