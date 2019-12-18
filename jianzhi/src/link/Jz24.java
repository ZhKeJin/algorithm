package link;

/**
 * @author Zhangkj
 * @date 2019-12-18-12:49
 */

/**
 * 	反转链表
 */
public class Jz24 {

    public ListNode ReverseList(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode phead = null;

        ListNode p = null;

        while(head!=null){
            p=head ;
            head = head.next;
            p.next = phead;
            phead = p;
        }

        return phead;

    }


}
