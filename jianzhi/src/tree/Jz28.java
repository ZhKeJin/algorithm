package tree;

/**
 * @author Zhangkj
 * @date 2019-12-16-16:52
 */

/**
 * 	对称二叉树
 */
public class Jz28 {
    boolean isSymmetrical(TreeNode pRoot){

        if(pRoot==null){
            return true;
        }

        return isSymmetrical(pRoot.left,pRoot.right);
    }
    boolean isSymmetrical(TreeNode left,TreeNode right){

        if((left==null&&right!=null)||(left!=null&&right==null)){
            return false;
        }
        if(left==null&&right==null){
            return true;
        }
        if(left.val != right.val){
            return false;
        }
        return isSymmetrical(left.left,right.right)&&isSymmetrical(right.left,left.right);
    }

}
