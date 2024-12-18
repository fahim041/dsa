package ds;

public class LinkedList {
    private class ListNode {
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;
    ListNode tail;

    public LinkedList(){
        head = new ListNode(-1);
        tail = head;
    }

    public void insertEnd(int val){
        ListNode newNode = new ListNode(val);
        tail.next = newNode;
        tail = tail.next;
    }

    public void insertStart(int val){
        ListNode node = new ListNode(val);
        if(head == tail){
            head.next = node;
            tail = node;
            return;
        }

        node.next = head.next;
        head.next = node;
    }

    public int removeEnd(){
        if(head == tail){
            System.out.println("List is empty!");
            return -1;
        }

        if(head.next == tail){
            int val = tail.val;
            head.next = null;
            tail = head;
            return val;
        }

        ListNode curr = head.next;
        while(curr.next != tail){
            curr = curr.next;
        }

        int val = tail.val;
        curr.next = null;
        tail = curr;
        return val;
    }

    public int get(int index){
        ListNode curr = head.next;
        while(curr != null && index > 0){
            curr = curr.next;
            index--;
        }

        if(curr != null && index == 0){
           return curr.val;
        }
        return -1;
    }

    public int remove(int index){
        ListNode curr = head.next;

        while(curr != null && index - 1 > 0){
            curr = curr.next;
            index--;
        }

        int val = curr.next.val;
        if(curr != null && curr.next != null){
            if(curr.next == tail){
                tail = curr;
            }
            curr.next = curr.next.next;
        }

        return val;
    }

    public void print(){
        ListNode curr = head.next;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
