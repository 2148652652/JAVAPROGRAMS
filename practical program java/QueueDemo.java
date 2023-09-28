// Singly Linked List Using Queue (ADT)

class LNode {
  int data;
  LNode next;

  LNode(int d) {
    data = d;
  }
}

class Queue {
  LNode enqueue(LNode head, int a) {
    LNode tmp = new LNode(a);
    if (head == null) {
      head = tmp;
    } else {
      LNode tmp1 = head;
      while (tmp1.next != null) {
        tmp1 = tmp1.next;
      }
      tmp1.next = tmp;
    }
    return tmp;
  }

  LNode dequeue(LNode head) {
    if (head == null) {
      System.out.println("underflow");
    } else {
      head = head.next;
    }
    return head;
  }

  void display(LNode head) {
    System.out.print("\nList is: ");
    if (head == null) {
      System.out.println("No LNodes");
      return;
    }
    LNode tmp = head;
    while (tmp != null) {
      System.out.print(" " + tmp.data);
      tmp = tmp.next;
    }
  }
}

public class QueueDemo {
  public static void main(String[] args) {
    Queue ob = new Queue();
    LNode head = null;
    head = ob.enqueue(head, 1);
    head = ob.enqueue(head, 2);
    head = ob.enqueue(head, 3);
    head = ob.enqueue(head, 4);
    head = ob.enqueue(head, 5);
    ob.display(head);
    head = ob.dequeue(head);
    ob.display(head);
  }
}
