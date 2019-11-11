package tree;

/**
 * @author Zhangkj
 * @date 2019-11-10-21:42
 */

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

/**
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class Leedcode100 {

    public static void main(String[] args) {

        System.out.println(false?true:false);
        System.out.println(true ?true:false);

        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(15);
        TreeNode root4 = new TreeNode(7);

        root.left = root1;
        root.right = root2;
        root2.left = root3;
        root2.right = root4;

        TreeNode roo1 = new TreeNode(3);
        TreeNode ro1 = new TreeNode(9);
        TreeNode ro2 = new TreeNode(20);
        TreeNode ro3 = new TreeNode(15);
        TreeNode ro4 = new TreeNode(7);

        roo1.left = ro1;
        roo1.right = ro2;
        ro2.left = ro3;
        ro2.right = ro4;

        System.out.println(isSameTree(root,roo1));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p ==null && q==null){
            return true;
        }
        if((p==null&&q!=null) || (q==null&&p!=null)){
            return false;
        }

        if(p.val!=q.val){
            return false;
        }


        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right)?true:false;



    }


}
