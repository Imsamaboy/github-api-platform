import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private class Node {
        int key;
        int val;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.val = value;
        }
    }

    private class DoublyLinkedList {
        Node head;
        Node tail;

        public void push(Node new_node) {
            new_node.next = head;
            new_node.prev = null;
            if (head == null) tail = new_node;
            else head.prev = new_node;
            head = new_node;
        }

        public void remove(Node old_node) {
            if (old_node == head)
                head = old_node.next;
            if (old_node == tail)
                tail = old_node.prev;
            if (old_node.next != null)
                old_node.next.prev = old_node.prev;
            if (old_node.prev != null)
                old_node.prev.next = old_node.next;
        }
    }
    private Map<Integer, Node> cache = new HashMap<>();
    private int capacity;
    private DoublyLinkedList dll = new DoublyLinkedList();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            dll.remove(node);
            dll.push(node);

            return node.val;
        }

        return -1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            dll.remove(cache.get(key));
        } else if (cache.size() >= capacity) {
            Node lru = dll.tail;
            cache.remove(lru.key);
            dll.remove(lru);
        }

        Node n = new Node(key, value);
        cache.put(key, n);
        dll.push(n);
    }
}