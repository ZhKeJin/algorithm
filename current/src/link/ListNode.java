package link;

/**
 * @author Zhangkj
 * @date 2019-11-09-2:20
 */
public class ListNode {

    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }

    @Override
    public String toString() {
        return val + " " + next;
    }
}
