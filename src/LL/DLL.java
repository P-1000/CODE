package LL;

public class DLL {

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        if(head==null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next!=null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;

    }

    public Node find(int index){
        Node node = head;
        while(node!=null){
            node = node.next;
        }
        return node;
    }

    public void insert(int val , int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.prev = temp;
        node.next = temp.next;
        temp.next = node;
        if(node.next!=null){
            node.next.prev = node;
        }

    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.data + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("End");
        System.out.println("Reverse");
        while(last!=null){
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }


    private class Node{
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data , Node next , Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }


}
