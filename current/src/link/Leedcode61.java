package link;

/**
 * @author Zhangkj
 * @date 2019-11-09-18:41
 */



/**
 * 旋转链表：给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 */
public class Leedcode61 {

    public static void main(String[] args) {


        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(2);
        ListNode head5 = new ListNode(3);
        ListNode head6 = new ListNode(5);
        ListNode head7 = new ListNode(4);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;

        ListNode temp = rotateRight(head, 2);
        while (temp != null) {
            System.out.print(temp.val + "  ");
            temp = temp.next;
        }

    }

    /*
    链表的移动： 找到最后一个查到最前面，每次会改变head，所以要重新进行复头
     */
    public static ListNode rotateRight(ListNode head, int k) {

        ListNode p=head,q=p;

        for (int i = 0; i < k; i++) {
            q=p.next;
            while(q.next!=null){
                p=p.next;
                q=q.next;
            }

            q.next =head;
            p.next = null;
            head = q;//*****
            p = head;


        }

        return p;
    }





    public static ListNode rotateRight_1(ListNode head, int k) {

        if (head == null || k == 0 || head.next == null) {
            return head;
        }

        int n = 1;
        ListNode h1 = head;
        while (h1.next != null) {

            n++;
            h1 = h1.next;
        }

        System.out.println(n);

        int B = k >= n ? k % n : k;

        if(B==0){
            return head;
        }



        ListNode p = head;
        ListNode h = head;
        ListNode q = head;


        for (int i = 0; i <B; i++) {
            q=q.next;

        }

        while (q.next!=null){

            p = p.next;
            q = q.next;

        }
        ListNode h2 = p.next;

        p.next = null;

        q.next =h;

        return h2;
    }

}
