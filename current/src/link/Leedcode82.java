package link;

/**
 * @author Zhangkj
 * @date 2019-11-09-4:16
 */


/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leedcode82 {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(4);
        ListNode head5 = new ListNode(4);
        ListNode head6 = new ListNode(4);
        ListNode head7 = new ListNode(4);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;



        ListNode temp = deleteDuplicates_4(head);

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

    public static ListNode deleteDuplicates_2(ListNode head) {

        ListNode p = head;
        ListNode t = p.next;

        while(t.next!=null){
            if (t.val == p.val){
                t= t.next;
            }else{
                p.next=t;
                p=t;
                t=t.next;
            }
//            System.out.println(p + ", " + t);
        }

        p.next = t.next;

        return head;
    }

    public static ListNode deleteDuplicates_3(ListNode head) {
        if (head.next==null){
            return head;
        }
        if (head.val == head.next.val){
            return deleteDuplicates_3(head.next);
        }else{
            head.next = deleteDuplicates_3(head.next);
            return head;
        }
    }

    public static ListNode deleteDuplicates_4(ListNode head) {
        System.out.println(head);
        if (head.next==null){
            return head;
        }
        if (head.val == head.next.val){
            head.next = deleteDuplicates_4(head.next);
        }else{
            deleteDuplicates_3(head.next);
        }
        return head;
    }


}
