package link;

/**
 * @author Zhangkj
 * @date 2019-11-09-4:16
 */
public class Leedcode82 {

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



        ListNode temp = deleteDuplicates(head);

        while(temp!=null){
            System.out.print(temp.val+"  ");
            temp = temp.next;
        }



    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode p=head,q=head;
        if(head==null){
            return null;
        }

        while(head.next != null && head.val == head.next.val){
            head = head.next;
        }
        head.next.next =deleteDuplicates(head.next);

//        while(q.val==q.next.val){
//
//            q=q.next;
//
//        }
//
//        p.next = q.next;

        return head;

    }

}
