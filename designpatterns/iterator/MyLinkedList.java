class MyLinkedList {

    private class ListNode {
        ListNode next;
        ListNode prev;
        int val;

        ListNode() {
        }

        ListNode(int val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    private ListNode head = new ListNode();
    private ListNode tail = new ListNode();
    private int size;

    public MyLinkedList() {
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }

        return getNode(index).val;
    }

    public void addAtHead(int val) {
        addNewNodeAfter(head, val);
    }

    public void addAtTail(int val) {
        addNewNodeBefore(tail, val);
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return ;
        }
        else if (index == size) {
            addAtTail(val);
            return ;
        }
        else if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        addNewNodeBefore(getNode(index), val);
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return ;
        }

        var current = getNode(index);
        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    private ListNode getNode(int index) {
        var current = (ListNode)null;

        if (index < size / 2) {
            current = head.next;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        }
        else {
            current = tail.prev;
            for (int i = 0; i < size - index - 1; i++) {
                current = current.prev;
            }
        }

        return current;
    }

    private void addNewNodeAfter(ListNode node, int val) {
        var newNode = new ListNode(val, node.next, node);

        node.next.prev = newNode;
        node.next = newNode;

        size++;
    }

    private void addNewNodeBefore(ListNode node, int val) {
        var newNode = new ListNode(val, node, node.prev);

        node.prev.next = newNode;
        node.prev = newNode;

        size++;
    }
}