# Linked List

+ [Reverse Linked List](#reverse-linked-list)

[MDLink]: <>

## Reverse Linked List

https://leetcode.com/problems/reverse-linked-list/

```java
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode temp = current;
            current = current.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }
}
```

[Solution]: <>