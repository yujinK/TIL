class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def isPalindrome(self, head: ListNode) -> bool:
        value_list = []
        while True:
            value_list.append(head.val)
            if head.next != None:
                head = head.next
            else:
                break

        return value_list == value_list[::-1]

solution = Solution()
head = ListNode(1)
node2 = ListNode(2)
node3 = ListNode(2)
node4 = ListNode(1)

head.next = node2
node2.next = node3
node3.next = node4

print(solution.isPalindrome(head))