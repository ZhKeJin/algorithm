package link;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import javax.swing.*;
import java.io.InputStream;
import java.util.Queue;

/**
 * @author Zhangkj
 * @date 2019-11-09-1:12
 */
public class Leedcode83 {

     public static void main(String[] args) {
          ListNode head = new ListNode(1);
          ListNode head2 = new ListNode(1);
          ListNode head3 = new ListNode(2);
          ListNode head4 = new ListNode(2);
          ListNode head5 = new ListNode(3);
          ListNode head6 = new ListNode(3);
          ListNode head7 = new ListNode(4);
          ListNode head8 = new ListNode(4);

          head.next = head2;
          head2.next = head3;
          head3.next = head4;
          head4.next = head5;
          head5.next = head6;
          head6.next = head7;
          head7.next = head8;



          ListNode temp = deleteDuplicates_2(head);

          while(temp!=null){
               System.out.print(temp.val+"  ");
               temp = temp.next;
          }


     }

     public static ListNode deleteDuplicates_4(ListNode head) {

          ListNode p=head,q=p.next;

          while(q!=null){


          }

          return head;


     }

     public static ListNode deleteDuplicates(ListNode head) {

          ListNode p=head,q=head;

          while(q!=null){
               if(p.val==q.val){
                   p.next=q.next;
               }else{
                    p=q;
               }
               q=q.next;
          }

          return head;

     }

     public static ListNode deleteDuplicates_2(ListNode head) {

          ListNode p=head,q=p.next;

          while(q.next!=null){
               while (p.val==q.val){
                    q=q.next;
               }

               p.next=q;
               p = p.next;

               q=q.next;
          }

          return head;


     }

     public static ListNode deleteDuplicates_1(ListNode head) {
          if(head == null) {
               return null;
          }
          while(head.next != null && head.val == head.next.val) {
               head = head.next;
          }
          head.next = deleteDuplicates_1(head.next);
          return head;
     }



}
