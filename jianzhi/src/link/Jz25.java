package link;

/**
 * @author Zhangkj
 * @date 2019-12-18-11:24
 */

/*
合并两个有序链表
 */
public class Jz25 {

    public ListNode merry(ListNode list1,ListNode list2){
        ListNode head = new ListNode(-1);

        ListNode p =head;
        while(list1!=null&&list2!=null){

            if(list1.val<=list2.val){

                p.next = list1;
                list1 = list1.next;

                p = p.next;


            } else if(list1.val>list2.val){

                p.next = list2;
                list2 = list2.next;

                p = p.next;
            }
        }

        p.next = list1!=null?list1:list2;

        return head.next;
    }

}
