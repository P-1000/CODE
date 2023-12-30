package LL;

public class MainDll {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(20);
        list.insertFirst(25);
        list.insertFirst(30);
        list.insertLast(35);
        list.insert(1 , 2);
//        list.display();

//circular linked list :

        CLL ls = new CLL();
        ls.insert(10);
        ls.insert(16);
        ls.insert(22);
        ls.insert(25);
        ls.insert(28);
        ls.insert(34);
        ls.delete(25);
        ls.display();

    }
}
