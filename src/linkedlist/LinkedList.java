package linkedlist;
/*
 *   Linked List implementation
 *   
 *     l1 -> l2 -> l3
 * 
*/

public class LinkedList {

    LinkNode head = null;
    LinkNode last = null;

    public void add(int val) {
        LinkNode tmp = new LinkNode();
        tmp.value = val;
        tmp.next = null;
        if(head == null) {
            head = tmp;
            last = tmp;
        } else {
            last.next = tmp;
            last = last.next;
        }
        
    }
    public void display() {
        LinkNode tmp = head;
        while( tmp != null ) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }



    public static void main(String[] args) {
        //System.out.println("test");
        LinkedList list = new LinkedList();
        list.add(20);
        list.add(30);
        list.add(40);
        list.display();
        list.add(5);
        list.display();
    }

}