package link;


import java.util.Stack;

/**
 * @author Zhangkj
 * @date 2019-12-08-16:15
 */
public class JZFindFirstCommonNode {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);


        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(4);


        ListNode hea1 = new ListNode(0);
        ListNode hea2 = new ListNode(1);
        ListNode hea3 = new ListNode(2);

//        ListNode hea5 = new ListNode(5);

        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        hea1.next = hea2;
        hea2.next = hea3;
        hea3.next = head3;
        head3.next = head4;

        JZFindFirstCommonNode jzFindFirstCommonNode = new JZFindFirstCommonNode();

//        ListNode node = jzFindFirstCommonNode.FindFirstCommonNode(head1, hea1);
        ListNode node = jzFindFirstCommonNode.FindFirstCommonNode_2(head1, hea1);

        System.out.println(node.val);


    }

    public ListNode FindFirstCommonNode_2(ListNode pHead1, ListNode pHead2) {

        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();



        while(pHead1!=null){
            stack1.push(pHead1);
            pHead1= pHead1.next;
        }
        while(pHead2!=null){
            stack2.push(pHead2);
            pHead2= pHead2.next;
        }

        ListNode temp = null;

       // System.out.println(stack1.peek());

        while(stack1.peek()==stack2.peek()){
            temp = stack1.peek();
            stack1.pop();
            stack2.pop();
            continue;
        }

        return temp;





    }



        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        int len1 = 0, len2 = 0;
        ListNode p1 = pHead1, p2 = pHead2;

        while (p1 != null) {
            len1++;
            p1 = p1.next;
        }
        while (p2 != null) {
            len2++;
            p2 = p2.next;
        }


        if (len2 > len1) {
            ListNode temp = pHead1;
            pHead1 = pHead2;
            pHead2 = temp;

            int t= len2;
            len2 =len1;
            len1 = t;

        }

//        System.out.println(pHead1);
//        System.out.println(pHead2);
//        System.out.println(len1>len2);
//        System.out.println(len2);


        int i = 1;
        for (p1 = pHead1; i <= len1 - len2; i++) {
            p1 = p1.next;
        }
//        if(len1>len2){
//            for(p1 = pHead1;i<=len1-len2;i++){
//                p1= p1.next;
//            }
//        }
//        if(len1<len2){
//            for(p2 = pHead2;i<len2-len1;i++){
//                p2= p2.next;
//            }
//        }

        p2 = pHead2;
        while(p1!=null){
            if(p1==p2){
                return p1;
            }

            p1=p1.next;
            p2=p2.next;

        }

        return null;
    }






}
