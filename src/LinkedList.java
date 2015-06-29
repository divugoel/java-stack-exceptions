/**
 * Created by cerebro on 25/06/15.
 */
public class LinkedList {
    private Node head;
    private Node tail;

    public void insert(Object o) {
        Node someNode = new Node();
        someNode.obj = o;

        if(head == null) {
            head = someNode;
            tail = someNode;
        } else {
            tail.next = someNode;
            tail = someNode;
        }
    }

    public Object fetch(int index) {
        Node mostWantedNode = head;

        for(int i = 0; i<index; i++) {
            if(mostWantedNode == null) {
                return null;
            }
            mostWantedNode = mostWantedNode.next;
        }

        return mostWantedNode.obj;
    }
}
