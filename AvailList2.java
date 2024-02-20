package javaapplication23;

public class AvailList2 {

    public int data;
    public static AvailList2 head;
    AvailList2 next;

    AvailList2(int data) {
        this.data = data;
        this.next = null;
    }

    static void print(AvailList2 n) {
        AvailList2 current = head;
        while (current != null) {
            if (current != null && current.next != null) {
                System.out.print(current.data + " → ");
            } else {
                System.out.println(current.data + " ");
            }
            current = current.next;
        }
    }

    static void insertLast(int data) {
        AvailList2 new_node = new AvailList2(data);

        if (head == null) {
            head = new_node;
            return;
        }

        AvailList2 last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }

    public static void insertAtFront(int data) {
        AvailList2 newNode = new AvailList2(data);
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    static AvailList2 insertAfter(AvailList2 prev_node, int data) {
        
        if (prev_node == null) {
            System.out.println(
                    "The given previous node cannot be NULL");
            return null;
        }

       
        AvailList2 new_node = new AvailList2(data);

      
        new_node.data = data;

        new_node.next = prev_node.next;

        return prev_node.next = new_node;
    }

    public static void main(String[] args) {
        AvailList2 n1 = new AvailList2(30);
        AvailList2 n2 = new AvailList2(50);
        AvailList2 n3 = new AvailList2(70);
        AvailList2 n4 = new AvailList2(90);

        head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println("Before");
        print(head);
        insertLast(100);
        insertAtFront(10);
        insertAfter(head, 20);
        insertAfter(n1, 40);
        insertAfter(n2, 60);
        insertAfter(n3, 80);

        System.out.println("After");
        print(head);
    }
}
