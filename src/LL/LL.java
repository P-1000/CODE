package LL;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtStart(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

        if(tail==null){
            tail = head;
        }

        size++;
    }

    public void insertAtEnd(int data){
        if(tail==null){
            insertAtStart(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;

        size++;
    }


    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insert(int data , int index){
        if(index == 0){
            insertAtStart(data);
        }

        if(index == size){
            insertAtEnd(data);
        }

        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(data , temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst(){
        int data = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return data;
    }



    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }



    public int deleteLast(){
        if(size <=1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.data;

        tail = secondLast;
        tail.next = null;

        return val;

    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }

        Node previous = get(index -1);
        int val = previous.next.data;
        previous.next  = previous.next.next;
        return  val;

    }


    private class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }


    }
}
