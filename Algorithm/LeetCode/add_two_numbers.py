from typing import List


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    # 전가산기
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        root = head = ListNode(0)

        carry = 0
        while l1 or l2 or carry:
            sum = 0

            if l1:
                sum += l1.val
                l1 = l1.next

            if l2:
                sum += l2.val
                l2 = l2.next

            carry, val = divmod(sum + carry, 10)
            head.next = ListNode(val)
            head = head.next
        
        return root.next


    ## 내가 푼 방법 (10진수 계산)
    # def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
    #     factor = 1
    #     sum = 0

    #     while True:
    #         if l1:
    #             sum += factor * l1.val
    #             l1 = l1.next

    #         if l2:
    #             sum += factor * l2.val
    #             l2 = l2.next

    #         if l1 == None and l2 == None:
    #             break

    #         factor *= 10

    #     head = cur = ListNode()

    #     while True:
    #         cur.next = ListNode(sum % 10)
    #         sum //= 10
    #         cur = cur.next

    #         if sum == 0:
    #             break

    #     return head.next


solution = Solution()

# l1 = ListNode(2)
# node11 = ListNode(4)
# node12 = ListNode(3)
# l1.next = node11
# node11.next = node12

# l2 = ListNode(5)
# node21 = ListNode(6)
# node22 = ListNode(4)
# l2.next = node21
# node21.next = node22

l1= ListNode(0)
l2 = ListNode(0)

result = Solution().addTwoNumbers(l1, l2)

while result != None:
    print(result.val)
    result = result.next