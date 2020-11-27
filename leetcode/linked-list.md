# Linked List

+ [Middle of the Linked List](#middle-of-the-linked-list)

[MDLink]: <>

## Middle of the Linked List

https://leetcode.com/problems/middle-of-the-linked-list/

```java
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode [] arrayOfNodes = new ListNode[100];
        int current = 0;
        while (head != null) {
            arrayOfNodes[current++] = head;
            head = head.next;
        }
        return arrayOfNodes[current / 2];
    }
}
```

[Solution]: <>