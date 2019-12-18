package link;

/**
 * @author Zhangkj
 * @date 2019-12-18-11:47
 */

/**
 * 	 两个链表的公共点
 */
public class Jz52 {

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        ListNode p1 = pHead1;
        ListNode p2 = pHead2;

        int num1=0;
        int num2=0;
        while (p1!=null) {
            num1++;
            p1 = p1.next;
        }
        while (p2!=null) {
            num2++;
            p2 = p2.next;
        }

        if(num2>num1){
            ListNode temp = pHead1;
            pHead1 = pHead2;
            pHead2 = temp;

            int t= num1;
            num1 = num2;
            num2 = t;
        }

        p1 = pHead1;//*******
        for(int i=1; i<num1-num2; i++){
            p1= p1.next;
        }

//        while(p1.val != p2.val){
//            p1 = p1.next;
//            p2 = p2.next;
//        }

        p2 = pHead2;//*******
        while(p1!=null){
            if(p1.val==p2.val){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
       return null;

    }


}
