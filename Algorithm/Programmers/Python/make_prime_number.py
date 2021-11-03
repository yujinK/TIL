# def solution(nums):
#     result = 0

#     for i in range(len(nums)-2):
#         for j in range(i + 1, len(nums)-1):
#             for k in range(j + 1, len(nums)):
#                 sum = nums[i] + nums[j] + nums[k]
#                 flag = True
#                 for l in range(2, (int)(sum/2) + 1):
#                     if sum % l == 0:
#                         flag = False
#                         break
                
#                 if flag:
#                     result += 1

#     return result

def solution(nums):
    from itertools import combinations as cb
    answer = 0

    for a in cb(nums, 3):
        cand = sum(a)
        for i in range(2, (int)(cand/2) + 1):
            if cand % i == 0:
                break
        else:
            answer += 1
        
    return answer


nums = [1,2,7,6,4]
print(solution(nums))