import collections
from typing import Deque

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    # # 1. 리스트 풀이
    # def isPalindrome(self, head: ListNode) -> bool:
    #     value_list = []
    #     while True:
    #         value_list.append(head.val)
    #         if head.next != None:
    #             head = head.next
    #         else:
    #             break

    #     return value_list == value_list[::-1]

    # # 2. 데크 풀이
    # def isPalindrome(self, head: ListNode) -> bool:
    #     q: Deque = collections.deque()
        
    #     if not head:
    #         return True
        
    #     node = head
    #     while node is not None:
    #         q.append(head.val)
    #         node = head.next

    #     while len(q) > 1:
    #         if q.popleft() != q.pop():
    #             return False
        
    #     return True

    # 3. 런너 풀이
    def isPalindrome(self, head: ListNode) -> bool:
        rev = None
        slow = fast = head
        
        while fast and fast.next:
            fast = fast.next.next
            rev, rev.next, slow = slow, rev, slow.next

        if fast:
            slow = slow.next

        while rev and rev.val == slow.val:
            rev, slow = rev.next, slow.next
        
        return not rev


solution = Solution()
head = ListNode(1)
node2 = ListNode(2)
node3 = ListNode(2)
node4 = ListNode(1)

head.next = node2
node2.next = node3
node3.next = node4

# print(solution.isPalindrome(head))
aa = None
print(not aa)