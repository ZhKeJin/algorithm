package link;

/**
 * @author Zhangkj
 * @date 2019-11-09-5:38
 */


import java.util.List;

/**
 * 合并两个有序链表：将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的 。
 */
public class Leedcode21 {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);


        ListNode hea1 = new ListNode(3);
        ListNode hea2 = new ListNode(3);
        ListNode hea3 = new ListNode(4);
        ListNode hea4 = new ListNode(4);
        ListNode hea5 = new ListNode(5);

        head1.next = head2;
        head2.next = head3;

        hea1.next = hea2;
        hea2.next = hea3;
        hea3.next = hea4;
        hea4.next = hea5;


        ListNode temp = mergeTwoLists(head1, hea1);

        while (temp != null) {
            System.out.print(temp.val + "  ");
            temp = temp.next;
        }


    }

    /*
    设置新的节点用if else好理解
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(-1);
        ListNode temp = head;

        while(l1!=null && l2!=null){

            if(l1.val<=l2.val){
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next=l2;
                l2 = l2.next;
            }
            temp = temp.next;

        }

        temp.next = l1!=null?l1:l2;

        return head.next;


    }

    /*
    空指针异常
     */
    public static ListNode mergeTwoLists_1(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(-1);

        ListNode temp = head;

        while(l1.next!=null && l2.next!=null){

            while (l1!=null&&l1.val<=l2.val){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;

            }
            while (l2!=null&&l1.val>l2.val){
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }

        }

        temp.next = l1.next==null?l2:l1;

        return head.next;
    }


    public static ListNode mergeTwoLists_2(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);

        ListNode temp = head;

        while(l1!=null && l2!=null){

            while (l1!=null&&l1.val<=l2.val){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;

            }
            while (l2!=null&&l1!=null&&l1.val>l2.val){
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }

        }

        temp.next = l1==null?l2:l1;

        return head.next;

    }





}
