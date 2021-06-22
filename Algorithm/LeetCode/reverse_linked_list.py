class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    ## recursion
    # def reverseList(self, head: ListNode) -> ListNode:
    #     def reverse(node: ListNode, prev: ListNode = None):
    #         if not node:
    #             return prev
    #         next, node.next = node.next, prev
    #         return reverse(next, node)
        
    #     return reverse(head)

    def reverseList(self, head: ListNode) -> ListNode:
        node, prev = head, None

        while node:
            next, node.next = node.next, prev
            prev, node = node, next

        return prev

solution = Solution()
list_node = ListNode(1)
node1 = ListNode(2)
node2 = ListNode(3)
node3 = ListNode(4)
node4 = ListNode(5)
list_node.next = node1
node1.next = node2
node2.next = node3
node3.next = node4

print(solution.reverseList(list_node)) 