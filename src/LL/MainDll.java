package LL;

public class MainDll {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(20);
        list.insertFirst(25);
        list.insertFirst(30);
        list.insertLast(35);
        list.insert(1 , 2);
        list.display();
    }
}
