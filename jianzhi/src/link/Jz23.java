package link;

import java.awt.*;
import java.util.LinkedList;

/**
 * @author Zhangkj
 * @date 2019-12-18-13:45
 */

/**
 * 环形链表的入口
 */
public class Jz23 {




    //找到一快一满指针相遇处的节点，相遇的节点一定是在环中
    public static ListNode meetingNode(ListNode head) {
        if(head==null)
            return null;

        ListNode slow = head.next;
        if(slow==null)
            return null;

        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if(slow==fast){
                return fast;
            }
            slow=slow.next;
            fast=fast.next;

            if(fast!=slow){
                fast=fast.next;
            }
        }
        return null;
    }
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode meetingNode=meetingNode(pHead);
        if(meetingNode==null)
            return null;
//      得到环中的节点个数
        int nodesInLoop=1;
        ListNode p1=meetingNode;
        while(p1.next!=meetingNode){
            p1=p1.next;
            ++nodesInLoop;
        }
//      移动p1
        p1=pHead;
        for(int i=0;i<nodesInLoop;i++){
            p1=p1.next;
        }
//      移动p1，p2
        ListNode p2=pHead;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }











    public ListNode EntryNodeOfLoop_1(ListNode pHead) {

        ListNode p1 = pHead;
        ListNode p2 = pHead.next;

//        while(p1!=p2){
//            p1= p1.next;
//            p2 = p2.next.next;
//            if(p2==null||p1==null){
//                return null;
//            }
//
//        }



        while(p2!=null){

            if(p2==null || p1==null){
                return null;
            }

            p2 = p2.next;
            p1 = p1.next;

            if(p2!=p1){
                p2 = p2.next;
            }

            if(p1==p2){
                break;
            }

        }

        int count =1;

//        ListNode temp = p1;
        p2 =p2.next;
        while(p2!=p1){
            count++;
            //p1= p1.next;
            p2= p2.next;
        }

        p1 = pHead;
        p2 = pHead;

        for (int i = 0; i < count; i++) {

            p2 = p2.next;

        }

        while(p1 != p2){
            p1 =p1.next;
            p2 =p2.next;

        }

        return p1;

    }

}
