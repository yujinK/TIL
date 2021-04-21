key = [[0,0,0],[1,0,0],[0,1,1]]
lock = [[1,1,1],[1,1,0],[1,0,1]]

def turn(key):
    m = len(key)
    new_key = [[0] * m for _ in range(m)]
    for i in range(m):
        for j in range(m-1, -1, -1):
            new_key[i][j] = key[m-1-j][i]

    return new_key

def move_horizontal(key):
    m = len(key)
    new_key = [[0] * m for _ in range(m)]
    for i in range(m):
        for j in range(1, m):
            new_key[i][j] = key[i][j-1]

    return new_key

def move_vertical(key):
    m = len(key)
    new_key = [[0] * m for _ in range(m)]
    for i in range(1, m):
        for j in range(m):
            new_key[i][j] = key[i-1][j]

    return new_key

def check(key, lock):
    flag = True
    for i in range(len(lock)):
        for j in range(len(lock)):
            if key[i][j] == lock[i][j]:
                flag = False
                break
        if flag == False:
            break

    return flag

def solution(key, lock):
    answer = False

    for i in range(4):
        turn_key = turn(key)
        if check(turn_key, lock):
            answer = True
            break
        else:
            for j in range(len(key)):
                horizontal_key = move_horizontal(turn_key)
                if check(horizontal_key, lock):
                    answer = True
                    break
                for k in range(len(key)):
                    vertical_key = move_vertical(horizontal_key)
                    if check(vertical_key, lock):
                        answer = True
                        break
            if answer == True:
                break

    return answer

print(solution(key, lock))
