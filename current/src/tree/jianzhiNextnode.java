package tree;

import sun.reflect.generics.tree.Tree;

import java.util.List;

/**
 * @author Zhangkj
 * @date 2019-11-19-21:15
 */

/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class jianzhiNextnode {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(15);
        TreeNode root4 = new TreeNode(7);

        root.left = root1;
        root.right = root2;
        root2.left = root3;
        root2.right = root4;



    }




    public int inorder(TreeNode root, TreeNode pNode){

        if(root!=null){

            inorder(root.left,pNode);
            if(root.val == pNode.val) return root.right.val;
            inorder(root.right,pNode);

        }


        return 0;
    }




}
