package ds;

public class DoublyLinkedList {
    private class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        public ListNode(int val){
            this.val = val;
            next = null;
            prev = null;
        }
    }

    private ListNode head;
    private ListNode tail;

    public DoublyLinkedList(){
        head = new ListNode(-1);
        tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
    }

    public void insertEnd(int val){
        ListNode newNode = new ListNode(val);
        newNode.next = tail;
        newNode.prev = tail.prev;

        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    public void insetFront(int val){
        ListNode newNode = new ListNode(val);
        newNode.prev = head;
        newNode.next = head.next;

        head.next.prev = newNode;
        head.next = newNode;
    }

    public void removeFront(){
        head.next.next.prev = head;
        head.next = head.next.next;
    }

    public void removeEnd(){
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;
    }

    public int get(int index){
        ListNode curr = head.next;
        while(curr != null && index > 0){
            curr = curr.next;
            index--;
        }

        if(curr != null && curr != tail && index == 0){
            return curr.val;
        }
        return -1;
    }

    public void insertIndex(int index, int val){
        ListNode curr = head.next;
        while(curr != null && index > 0){
            curr = curr.next;
            index--;
        }

        if(curr != null && index == 0){
            ListNode newNode = new ListNode(val);
            newNode.next = curr;
            newNode.prev = curr.prev;

            curr.prev.next = newNode;
            curr.prev = newNode;
        }
    }

    public void removeIndex(int index){
        ListNode curr = head.next;
        while(curr != null && index > 0){
            curr = curr.next;
            index--;
        }

        if(curr != null && curr != tail && index == 0){
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;

        }
    }

    public void print(){
        ListNode curr = head.next;
        while(curr != tail){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
