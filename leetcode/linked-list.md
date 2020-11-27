# Linked List

+ [Reorder List](#reorder-list)

[MDLink]: <>

## Reorder List

https://leetcode.com/problems/reorder-list/

```java
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode Temp = current.next;
            current.next = prev;
            prev = current;
            current = Temp;
        }
        return prev;
    }

    public ListNode getMiddleNode(ListNode head) {
        ListNode slowNode = head;
        ListNode prevSlowNode = slowNode;
        ListNode fastNode = head;

        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            prevSlowNode = slowNode;
            slowNode = slowNode.next;
        }

        if (fastNode != null) {
            ListNode secondPart = slowNode.next;
            slowNode.next = null;
            return secondPart;
        } else {
            ListNode secondPart = prevSlowNode.next;
            prevSlowNode.next = null;
            return secondPart;
        }
    }

    public ListNode mergeTwoLists(ListNode first, ListNode second) {
        ListNode currentNode1 = first;
        ListNode currentNode2 = second;
        while (currentNode1 != null && currentNode2 != null) {
            ListNode firstNext = currentNode1.next;
            ListNode secondNext = currentNode2.next;
            currentNode1.next = currentNode2;
            currentNode2.next = firstNext;
            currentNode1 = firstNext;
            currentNode2 = secondNext;
        }
        return first;
    }

    public void reorderList(ListNode head) {
        if (head != null) {
            head = mergeTwoLists(head, reverseList(getMiddleNode(head)));
        }
    }
}
```

[Solution]: <>