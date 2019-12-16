package tree;

/**
 * @author Zhangkj
 * @date 2019-12-16-16:51
 */

/*
	二叉树的镜像

 */
public class Jz27 {
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);


    }
}
