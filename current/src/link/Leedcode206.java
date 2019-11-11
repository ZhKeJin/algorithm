package link;

/**
 * @author Zhangkj
 * @date 2019-11-09-22:47
 */

/**
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class Leedcode206 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(2);
        ListNode head5 = new ListNode(3);
        ListNode head6 = new ListNode(4);
        ListNode head7 = new ListNode(4);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;


        //ListNode temp = reverseList(head);

        ListNode head9 = head;



        ListNode temp = reverseList_1(null,head9);
        System.out.println(head);

        System.out.println(temp);

    }

    public static ListNode reverseList_1(ListNode node1, ListNode node2) {


        if(node2==null){
            return node1;
        }

        ListNode node = node2.next;

        node2.next = node1;

        return  reverseList_1(node2,node);



    }


    public static ListNode reverseList(ListNode head) {
        ListNode head1 = null;
        ListNode p = head;



        while (head != null) {

            p=head;

            head = head.next;

            p.next = head1;

            head1 = p;
        }

        return head1;

    }


}
