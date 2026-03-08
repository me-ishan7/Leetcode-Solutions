class Solution {
    public Node segregate(Node head) {

        if (head == null || head.next == null) return head;

        Node s0 = null, s1 = null, s2 = null;
        Node t0 = null, t1 = null, t2 = null;

        Node temp = head;

        while (temp != null) {
            Node next = temp.next; // store next
            temp.next = null;      // detach node

            if (temp.data == 0) {
                if (s0 == null) {
                    s0 = t0 = temp;
                } else {
                    t0.next = temp;
                    t0 = temp;
                }
            }
            else if (temp.data == 1) {
                if (s1 == null) {
                    s1 = t1 = temp;
                } else {
                    t1.next = temp;
                    t1 = temp;
                }
            }
            else {
                if (s2 == null) {
                    s2 = t2 = temp;
                } else {
                    t2.next = temp;
                    t2 = temp;
                }
            }

            temp = next;
        }

        // connect lists
        if (t0 != null) {
            t0.next = (s1 != null) ? s1 : s2;
        }

        if (t1 != null) {
            t1.next = s2;
        }

        // decide new head
        if (s0 != null) return s0;
        if (s1 != null) return s1;
        return s2;
    }
}