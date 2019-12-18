package link;

/**
 * @author Zhangkj
 * @date 2019-12-18-13:32
 */

/**
 * 倒数第K个
 */
public class Jz22 {


    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k ==0 ){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<k;i++){
            if(fast==null){
                return null;
            }
            fast=fast.next;

        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;

    }



    public ListNode FindKthToTail_1(ListNode head,int k) {
        if(head==null||k==0){
            return null;
        }

        ListNode p1 =head;
        ListNode p2 = head;

        for(int i=0;i<k;i++){

            if(p2.next==null){
                return null;
            }
            p2 =p2.next;
        }

        while(p2!=null){
            p1= p1.next;
            p2= p2.next;
        }

        return p1;




    }

}
