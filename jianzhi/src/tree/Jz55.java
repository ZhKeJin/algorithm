package tree;


/**
 * @author Zhangkj
 * @date 2019-12-16-16:31
 */

/**
 * 树的高度
 */
public class Jz55 {

    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }

        if(root.left==null&&root.right==null){
            return 1;
        }

        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;

    }

}
