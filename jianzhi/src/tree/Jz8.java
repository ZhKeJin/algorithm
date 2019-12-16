package tree;

/**
 * @author Zhangkj
 * @date 2019-12-16-21:05
 */


/**
 * 二叉树的下个节点
 *          a
 *  *    /     \
 *  *   b       c
 *  *  / \    /  \
 *  * d   e   f   g
 *       / \
 *      h   i
 *
 *
 *      b:右的左     d:如果 他是父节点的左，则下一个就是父节点
 *      i：父节点的右   则当前节点是父  一直找到父是某个的左   d i合并
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class Jz8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){

        if(pNode==null){
            return null;
        }
        if(pNode.right!=null){
            TreeLinkNode cur = pNode.right;
            while(cur.left!=null){
                cur = cur.left;
            }

            return cur;
        }else{
            TreeLinkNode cur = pNode.next;
            while(pNode != cur.left){
                pNode = cur;
                cur = cur.next;
            }

            return cur;
        }


    }
}
