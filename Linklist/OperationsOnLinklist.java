public class OperationsOnLinklist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // add node in the first position of Linklist
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    // add node in the last position of Linklist
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add element in the middle of the linklist
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < idx - 1) { // i=idx-1 means temp = prev
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // print a linklist
    public void printLinklist() {
        if (head == null) {
            System.out.println("Linklist is empty ");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Size of the Linklist
    // public static int size;
    // System.out.print("the Size of linklist is: "+ ll.size );

    // Remove from a linklist
    public int removeFirst(int size) {
        // public static int size;
        if (size == 0) {
            System.out.println("Empty linklist ");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        return val;
    }

    // Remove element from the end of the list
    public int removeLast(int size) {
        if (size == 0) {
            System.out.println("linklist is empty ");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    // Iterative Search
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                // key found
                return i;

            }
            temp = temp.next;
            i++;
        }
        return -1;

    }

    public int recursiveSearch(Node head, int key) {
        if (head == null) {
            return -1;

        }
        if (head.data == key) {
            return 0;
        }
        int idx = recursiveSearch(head.next, key);
        if (idx == -1) {
            return -1;

        }
        return idx + 1;

    }

    // reverse a Linklist
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // find and remove nth node from the End
    public void deleteNthFromEnd(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;

        }
        if (n == size) {
            head = head.next;
            return;
        }
        // size-n ----> i=index to find
        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        OperationsOnLinklist list = new OperationsOnLinklist();
        System.out.println(list.size());
        list.addFirst(0);
        list.printLinklist();
        list.add(0, 50);
        list.printLinklist();
        list.addFirst(1);
        list.addLast(10);
        list.add(3, 40);
        list.printLinklist();
        list.reverse();
        list.printLinklist();
        System.out.println(list.recursiveSearch(head, 50));
        list.deleteNthFromEnd(1);
        list.printLinklist();
        list.deleteNthFromEnd(2);
        list.printLinklist();
        list.size();

    }
}