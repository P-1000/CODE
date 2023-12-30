package LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtStart(20);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtEnd(60);
        list.insertAtStart(0);
        list.insert(999 , 5);
        list.deleteLast();
        list.insert(9999 , 2);
        list.insert(30 , 3);
//        list.deleteFirst();
//        list.display();
//        list.delete(3);
        list.display();
        list.delete(2);
        list.display();
    }
}
