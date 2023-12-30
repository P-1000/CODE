package LL;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtStart(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertAtEnd(int val){
        if(tail==null){
            insertAtStart(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val , int index){
        if(index==0){
            insertAtStart(val);
            return;
        }
        if(index==size){
            insertAtEnd(val);
            return;
        }

        Node temp = head;
        for(int i =1;i<index ; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("Index "+ index + ", Size : "  + size );
        }
        Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.data;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }

        Node prev = get(index -1);
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("End");
    }



    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}