package tree;

/**
 * @author Zhangkj
 * @date 2019-12-11-22:24
 */

import com.sun.corba.se.impl.interceptors.PICurrent;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class JZSouSuoKthNode {


    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(5);
        TreeNode root2 = new TreeNode(3);
        TreeNode root3 = new TreeNode(7);
        TreeNode root4 = new TreeNode(2);
        TreeNode root5 = new TreeNode(4);
        TreeNode root6 = new TreeNode(6);
        TreeNode root7 = new TreeNode(8);

        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;

        JZSouSuoKthNode jzSouSuoKthNode = new JZSouSuoKthNode();


        TreeNode treeNode = jzSouSuoKthNode.KthNode(root1, 4);

        System.out.println(treeNode.val);


    }


    /*
    中序遍历 是递增的过程  用栈实现
     */

    TreeNode KthNode(TreeNode pRoot, int k) {




        Stack<TreeNode> stack = new Stack<>();

       // stack.push(pRoot);

        TreeNode cur = pRoot;
        int count =0;
        while(cur!=null|| !stack.empty()){

            while (cur!=null){
                stack.push(cur);
                cur = cur.left;

            }

            cur = stack.pop();

            //System.out.println(cur.val);
            if(++count==k){
                return cur;
            }

//            if(cur.right!=null){

                cur = cur.right;
//            }


        }

        return null;

    }




}
