package tree;

/**
 * @author Zhangkj
 * @date 2019-12-16-16:38
 */


import java.util.Stack;

/**
 * 	二叉搜索树的第K大
 */
public class Jz54 {

    TreeNode KthNode(TreeNode pRoot, int k){

        if(pRoot==null){
            return null;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();

        int count = 0;
        TreeNode cur = pRoot;
        while(cur!=null||!stack.isEmpty()){

            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }

            cur = stack.pop();

            if(++count==k){
                return cur;
            }

            if(cur.right!=null){
                cur = cur.right;
            }

        }


        return null;
    }
}
