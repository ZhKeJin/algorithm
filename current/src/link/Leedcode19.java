package link;

/**
 * @author Zhangkj
 * @date 2019-11-09-5:03
 */

/**
 * 删除链表中的倒数 第 K个节点.
 */
public class Leedcode19 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(2);
        ListNode head5 = new ListNode(3);
        ListNode head6 = new ListNode(3);
        ListNode head7 = new ListNode(4);
        ListNode head8 = new ListNode(4);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;



        ListNode temp = removeNthFromEnd(head,8);

        while(temp!=null){
            System.out.print(temp.val+"  ");
            temp = temp.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode q=head,p=head;

        for (int i = 1; i <= n; i++) {
            q=q.next;

            /*
            注意边界容易空指针异常
             */
            if(q==null){
                return head.next;
            }
        }

        while(q.next!=null){
            p=p.next;
            q=q.next;
        }

        p.next = p.next.next;


        return head;
    }



}
