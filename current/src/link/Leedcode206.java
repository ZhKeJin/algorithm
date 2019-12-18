package link;

/**
 * @author Zhangkj
 * @date 2019-11-09-22:47
 */

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
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

        head.next = head2;
        head2.next = head3;
        head3.next = head4;




//        ListNode node = reverseList_2(head);
        ListNode node = reverseList_6(head);
        System.out.println(node.toString());

    }


    /*
    递归：链表的结束只能是null   否则会出现java.lang.StackOverflowError
     */
    public static ListNode reverseList(ListNode head){

//        return reverseList_3(head,head.next);
        return reverseList_3(null,head);
    }
    public static ListNode reverseList_3(ListNode node1, ListNode node2) {
         if(node2 == null){
             return node1;
         }

         ListNode node = node2.next;

         node2.next = node1;

         return reverseList_3(node2,node);


    }

    public static ListNode reverseList_6(ListNode head) {

        ListNode h1= null;

        ListNode p=head;

        while(head!=null){

            p =head;
            head= head.next;
            p.next = h1;
            h1 = p;


//            p.next = h1;
//            h1= p;
//
//            head= head.next;
//            System.out.println(p.next.val);
//
//            p = head;

        }

        return h1;
    }





    /*
    非递归: 创建一个新的头节点，每次找到原来的头节点进行   头插法 到新的链表
     */
    public static ListNode reverseList_2(ListNode head) {

        ListNode head1=null;
        ListNode p = head;
        while(head!=null){
            p =head;
            head = head.next;
            p.next = head1;
            head1 = p;
            System.out.println(head1.toString());

        }

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

}
