package link;

/**
 * @author Zhangkj
 * @date 2019-11-27-12:34
 */

import javax.xml.ws.spi.http.HttpHandler;
import java.util.Stack;

/**
 * 回文链表
 */
public class Leedcode234 {


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(1);
        ListNode head5 = new ListNode(2);

        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        System.out.println(isPalindrome_1(head));
//        System.out.println(isPalindrome(head));



    }

    public static boolean isPalindrome(ListNode head) {

        Stack<Integer> integers = new Stack<>();

        ListNode h = head;
        while (h!=null){
            integers.push(h.val);
            h= h.next;
        }

        for (Integer integer : integers) {
            System.out.println(integer);
        }


        ListNode p = head;
        while (p!=null){
            System.out.println("..");
            if(!integers.empty()&&p.val!=integers.pop()){
                return false;
            }
            p=p.next;
        }

        return true;
    }

    /*
    快慢指针
     */
    public static boolean isPalindrome_1(ListNode head) {

        Stack<Integer> integers = new Stack<>();

        ListNode s = head,f= head;
        while (f.next!=null){

            s=s.next;
            if(f.next==null){
                f= f.next;
            }else{
                f=f.next.next;
            }

        }

//        System.out.println(f);
//        System.out.println(s);


        ListNode p = s;
        while(p!=null){
            integers.push(p.val);
            p= p.next;
        }

        System.out.println(integers.size());
//
//        while (!integers.empty()){
//            System.out.println(integers.pop());
//        }
//

        System.out.println(".......");
        while (head!=s){
            System.out.println(head.val);
//            if(!integers.empty()){
//
//                System.out.println(head.val!=integers.pop());
//            }

            if(!integers.empty()&&head.val!=integers.pop()){
                return false;
            }
            head=head.next;
        }

        return true;
    }






}
