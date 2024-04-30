public class DoublyLinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("linklist is empty");
            return Integer.MIN_VALUE;

        }
        if (head.next == null) {
            int data = head.data;
            head = tail = null;
            return data;
        }
        int data = head.data;
        head.next.prev = null;
        head = head.next;
        size--;
        return data;

    }

    public void addLast(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;

        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
        newNode.next = null;
        newNode.prev = temp;
        size++;

    }

    public int removeLast() {
        if (head == null) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            int value = head.data;
            head = tail = null;
            return value;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int data = temp.next.data;
        Node prev1 = temp.next;
        prev1.prev = null;
        temp.next = null;
        return data;
    }

    public static void main(String args[]) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.addLast(4);
        dll.addLast(5);
        dll.print();
        System.out.println(dll.removeLast());
        dll.print();
        dll.reverse();
        dll.print();
    }

    public void reverse() {
        Node curr = head;
        Node next;
        Node prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

}
