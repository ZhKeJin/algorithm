package link;

/**
 * @author Zhangkj
 * @date 2019-12-10-15:30
 */

/**
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class JZdeleteDuplication {
    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(1);
        ListNode head4 = new ListNode(1);
        ListNode head5 = new ListNode(2);
        ListNode head6 = new ListNode(2);
        ListNode head7 = new ListNode(2);
        ListNode head8 = new ListNode(2);
        ListNode head9 = new ListNode(2);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        head7.next = head8;
        head8.next = head9;

        JZdeleteDuplication jZdeleteDuplication = new JZdeleteDuplication();

//        ListNode node = jZdeleteDuplication.deleteDuplication(head);
        ListNode node = jZdeleteDuplication.deleteDuplication_1(head);

        while(node!=null){
            System.out.println(node.val);
            node = node.next;

        }
    }


    /**
     * 不能存在重复的元素
     * @param pHead
     * @return
     */
    public ListNode deleteDuplication_1(ListNode pHead) {

        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode p = head;
        ListNode q=p.next;

        while(q!=null){

            if(q.next!=null&&q.val==q.next.val){
                while(q.next!=null&&q.val==q.next.val){
                    q=q.next;
                }

                //在if或else中都必须存在 p  给P 赋值  111 2 22
                p.next = q.next;
        //        System.out.println(p.toString());
                q = q.next;

            }else{
                p = p.next;

                q = q.next;
            }
        }

        return head.next;

    }
    /**
     * 删除链表中的重复的1 2 3 5 null
     * @param pHead
     * @return
     */
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode p= pHead;
        ListNode q= p;

        while(q!=null) {
            q = q.next;

            while(q!=null&&q.val == p.val){
                q= q.next;
            }

            p.next=q;

            p = q;

        }

        //p.next = null;

        return pHead;

    }




}
