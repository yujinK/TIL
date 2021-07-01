from typing import List


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        factor = 1
        n1 = 0
        n2 = 0

        while True:
            if l1 != None:
                n1 += factor * l1.val
                l1 = l1.next

            if l2 != None:
                n2 += factor * l2.val
                l2 = l2.next

            if l1 == None and l2 == None:
                break

            factor *= 10

        sum = n1 + n2
        head = cur = ListNode()

        while True:
            cur.next = ListNode(sum % 10)
            sum //= 10
            cur = cur.next

            if sum == 0:
                break

        return head.next


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