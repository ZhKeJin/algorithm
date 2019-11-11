package tree;

/**
 * @author Zhangkj
 * @date 2019-11-10-22:22
 */

import sun.reflect.generics.tree.Tree;
import sun.rmi.server.InactiveGroupException;

import java.util.HashMap;

/**
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 *
 * 注意:
 * 你可以假设树中没有重复的元素。
 *
 * 例如，给出
 *
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leedcode105 {

    HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

    int[] per;
    int[] in ;
    int perind=0;
    public static void main(String[] args) {

        Leedcode105 leedcode105 = new Leedcode105();
        int[] per = {3,9,20,15,7};
        int[] in = {9,3,15,20,7 };

        TreeNode.bianli(leedcode105.buildTree(per,in));


    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

          per = preorder;
          in = inorder;

//        TreeNode root=null;

        int inx = 0;
        for (int i : inorder) {

            integerIntegerHashMap.put(i,inx++);
        }

//        for (Integer integer : integerIntegerHashMap.keySet()) {
//            Integer integer1 = integerIntegerHashMap.get(integer);
//            System.out.println(integer+"        "+integer1);
//        }
//
//        System.out.println(inorder.length);

        return helpr(0,inorder.length);
    }

    public TreeNode helpr(int left,int right){

        if(left == right){
            return null;
        }

        TreeNode root = new TreeNode(per[perind]);

        int inorindex = integerIntegerHashMap.get(per[perind]);

        perind++;

        root.left = helpr(left,inorindex);
        root.right = helpr(inorindex+1,right);

        return root;

    }
}
