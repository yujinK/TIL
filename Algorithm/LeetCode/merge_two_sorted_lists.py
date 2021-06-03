class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
    
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = ListNode()
        tail = dummy

        while l1 and l2:
            if l1.val < l2.val:
                tail.next = l1
                l1 = l1.next
            else:
                tail.next = l2
                l2 = l2.next

            tail = tail.next
            
        if l1:
            tail.next = l1
        elif l2:
            tail.next = l2
        
        return dummy.next

solution = Solution()
l1 = ListNode(1)
l1_n1 = ListNode(2)
l1_n2 = ListNode(4)
l1.next = l1_n1
l1_n1.next = l1_n2

l2 = ListNode(1)
l2_n1 = ListNode(3)
l2_n2 = ListNode(4)
l2.next = l2_n1
l2_n1.next = l2_n2

print(solution.mergeTwoLists(l1, l2))