package link;

/**
 * @author Zhangkj
 * @date 2019-11-09-22:47
 */

import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;

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
        ListNode head = new ListNode(67);
        ListNode head2 = new ListNode(0);
        ListNode head3 = new ListNode(24);
        ListNode head4 = new ListNode(58);
//        ListNode head5 = new ListNode(3);
//        ListNode head6 = new ListNode(4);
//        ListNode head7 = new ListNode(4);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
//        head4.next = head5;
//        head5.next = head6;
//        head6.next = head7;


        //ListNode temp = reverseList(head);

        ListNode head9 = head;


        ArrayList<Integer> arrayList = new ArrayList<>();

         arrayList = reverseList_1(head9);

//        while (temp!=null){
//            arrayList.add(temp.val);
//        }

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head1 = null;
        ListNode p =  listNode;
        ArrayList arrayList =  new ArrayList();
        while(listNode!=null){
            p = listNode ;
            p.next = head1;
            listNode = listNode.next;
            head1 = p;
        }

        while(head1!=null){
            arrayList.add(head1.val);
            head1 = head1.next;
        }

        return arrayList;
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
        System.out.println(head1);


        return head1;

    }

    public static ArrayList<Integer> reverseList_1(ListNode head) {
        ListNode head1 = null;
        ListNode p ;

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (head != null) {

            p=head;

            head = head.next;

            p.next = head1;

            head1 = p;
        }


        System.out.println(head1);
        ListNode q = head1;
        while(q!=null){
            arrayList.add(q.val);
            q = q.next;
        }


        return arrayList;

    }

}
