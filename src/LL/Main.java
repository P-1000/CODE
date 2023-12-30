package LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtStart(20);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtStart(0);
        list.insertAtEnd(80);
        list.insertAtStart(5);
        list.deleteFirst();
        list.deleteLast();
        list.insertAtEnd(80);
        list.display();
        list.delete(3);
        list.display();
    }
}
