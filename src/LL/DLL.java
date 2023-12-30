package LL;

public class DLL {

    Node head;


   private class Node{
        int data;
        Node prev;
        Node next;

       public Node(int data) {
           this.data = data;
       }

       public Node(int data, Node prev, Node next) {
           this.data = data;
           this.prev = prev;
           this.next = next;
       }

   }


}
