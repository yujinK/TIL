class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    # def oddEvenList(self, head: ListNode) -> ListNode:
    #     root = cur = ListNode(0)
    #     evenRoot = even = ListNode(0)

    #     oddFlag = True
    #     while head:
    #         if oddFlag:
    #             cur.next = ListNode(head.val)
    #             cur = cur.next
    #             oddFlag = False
    #         else:
    #             even.next = ListNode(head.val)
    #             even = even.next
    #             oddFlag = True

    #         head = head.next

    #     cur.next = evenRoot.next
    #     return root.next

    def oddEvenList(self, head: ListNode) -> ListNode:
        if head is None:
            return None

        odd = head
        even = head.next
        even_head = head.next

        while even and even.next:
            odd.next, even.next = odd.next.next, even.next.next
            odd, even = odd.next, even.next

        odd.next = even_head
        return head

solution = Solution()
head = ListNode(1)
node1 = ListNode(2)
node2 = ListNode(3)
node3 = ListNode(4)
node4 = ListNode(5)
head.next = node1
node1.next = node2
node2.next = node3
node3.next = node4

result = solution.oddEvenList(head)
while result:
    print(result.val)
    result = result.next

