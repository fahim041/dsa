import ds.DoublyLinkedList;

public class Main {
    public static void main(String[] args){
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertEnd(4);
        dl.insertEnd(1);
        dl.insertEnd(7);
        dl.insetFront(5);

        dl.removeIndex(3);

        dl.print();
    }
}
