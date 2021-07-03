class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        prev = None
        result = cur = ListNode(0)

        while head:
            if prev:
                cur.next = ListNode(head.val)
                cur = cur.next
                cur.next = ListNode(prev.val)
                cur = cur.next
                prev = None
            else:
                prev = ListNode(head.val)
            
            head = head.next

        if prev:
            cur.next = ListNode(prev.val)
            
        return result.next

solution = Solution()
head = ListNode(1)
node1 = ListNode(2)
node2 = ListNode(3)
node3 = ListNode(4)
head.next = node1
node1.next = node2
node2.next = node3

result = solution.swapPairs(head)
while result:
    print(result.val)
    result = result.next