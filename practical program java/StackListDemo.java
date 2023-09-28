// Singly LinkedList Using Stack

import java.util.*;

class LNode {
  int data;
  LNode next;

  LNode(int d) {
    data = d;
  }
}

class Stack {
  LNode push(int d, LNode head) {
    LNode temp1 = new LNode(d);
    if (head == null) {
      head = temp1;
    } else {
      temp1.next = head;
      head = temp1;
    }
    return head;
  }

  LNode pop(LNode head) {
    if (head == null)
      System.out.println("underflow");
    else
      head = head.next;
    return head;
  }

  void display(LNode head) {
    System.out.println("\n list is ");
    if (head == null) {
      System.out.println("No LNodes");
      return;
    }
    LNode tmp = head;
    while (tmp != null) {
      System.out.print(tmp.data + " ");
      tmp = tmp.next;
    }
  }

  boolean isEmpty(LNode head) {
    if (head == null)
      return true;
    else
      return false;
  }

  int peek(LNode head) {
    if (head == null)
      return -1;
    return head.data;
  }
}

public class StackListDemo {
  public static void main(String[] args) {
    Stack s = new Stack();
    LNode head = null;
    Scanner in = new Scanner(System.in);
    do {
      System.out.println("\n*****MENU*****");
      System.out.println("\n1.PUSH");
      System.out.println("\n2.POP");
      System.out.println("\n3.PEEK");
      System.out.println("\n4.IS EMPTY");
      System.out.println("\n5.DISPLAY");
      System.out.println("\n6.EXIT");
      System.out.println("\nEnter your choice: ");
      switch (in.nextInt()) {
        case 1:
          System.out.println("\nEnter the value: ");
          head = s.push(in.nextInt(), head);
          break;
        case 2:
          head = s.pop(head);
          break;
        case 3:
          System.out.println("\n top element: " + s.peek(head));
          break;
        case 4:
          System.out.println("\n is empty: " + s.isEmpty(head));
          break;
        case 5:
          s.display(head);
          break;
        default:
          System.out.println("\n Wrong choice");
          break;
      }
      System.out.println("\ndo you want to continue? press '0'");
    } while (in.nextInt() == 0);
  }
}
