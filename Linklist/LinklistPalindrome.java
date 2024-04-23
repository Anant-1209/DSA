public class LinklistPalindrome {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node head;
    public static Node tail;

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        Node midNode = findmid(head);
        Node secondHalf = reverse(midNode.next);
        midNode.next = null;

        Node right = secondHalf;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;

            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public void AddFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node nextNode;

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }

    public static void main(String args[]) {
        LinklistPalindrome ll = new LinklistPalindrome();
        ll.AddFirst(1);
        ll.AddFirst(2);
        ll.AddFirst(3);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);

        if (ll.checkPalindrome()) {
            System.out.println("Linklist is a palindrome");
        } else {
            System.out.println("linked list is not palindrome");
        }

    }
}
