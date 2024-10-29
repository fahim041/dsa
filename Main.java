import ds.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.insertEnd(5);
        ll.insertEnd(12);
        ll.insertEnd(1);
        ll.insertStart(7);

        ll.print();
    }
}
