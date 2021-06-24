/** An SLList is a list of integers, which hides the terrible truth of
 * of the nakedness within */

public class SLList {

    /* The first item (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size;

    /** Create an empty SLList */
    public SLList() {
        sentinel = new IntNode(63, null);
        size = 0;

    }

    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    public SLList(int x) {
        sentinel = new IntNode(63, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

//    public static void main(String[] args) {
//        /* Creates a list of one integer, namely 10 */
//        SLList L = new SLList(10);
//    }

    /* Adds x to the front of the list */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /* Returns the first item int in the list */
    public int getFirst() {
        return sentinel.next.item;
    }

    /* Adds an item to the end of the list */
    public void addLast(int x) {
        IntNode p = sentinel;
        size += 1;
        /* Move p until it reaches the end of the list */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

//    /* Returns the size of the list that starts at IntNode p */
//    private static int size(IntNode p) {
//        if (p.next == null) {
//            return 1;
//        }
//        return 1 + size(p.next);
//
//    }

    public int size() {
        return size;
    }


    public static void main(String[] args) {
        /* */
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        System.out.println(L.size());
    }


}
