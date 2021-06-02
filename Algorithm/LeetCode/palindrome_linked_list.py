import collections
from typing import Deque

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    # # 리스트 풀이
    # def isPalindrome(self, head: ListNode) -> bool:
    #     value_list = []
    #     while True:
    #         value_list.append(head.val)
    #         if head.next != None:
    #             head = head.next
    #         else:
    #             break

    #     return value_list == value_list[::-1]

    # 데크 풀이
    def isPalindrome(self, head: ListNode) -> bool:
        q: Deque = collections.deque()
        
        if not head:
            return True
        
        node = head
        while node is not None:
            q.append(head.val)
            node = head.next

        while len(q) > 1:
            if q.popleft() != q.pop():
                return False
        
        return True

solution = Solution()
head = ListNode(1)
node2 = ListNode(2)
node3 = ListNode(2)
node4 = ListNode(1)

head.next = node2
node2.next = node3
node3.next = node4

print(solution.isPalindrome(head))