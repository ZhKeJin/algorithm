package tree;

/**
 * @author Zhangkj
 * @date 2019-12-16-17:24
 */

/*
	树的子结构

 */
public class Jz26 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root2==null||root1==null){
            return false;
        }

        return hasSub(root1,root2)||hasSub(root1.left,root2)||hasSub(root1.right,root2);
    }

    public boolean hasSub(TreeNode root1,TreeNode root2){
        ////// if((root1!=null&&root2==null)||(root1==null&&root2==null)){
        //     return true;
        // }
        if (root2 == null) {
            return true;
        }

        if(root1==null&&root2!=null){
            return false;
        }
        if(root1.val != root2.val){
            return hasSub(root1.left,root2)||hasSub(root1.right,root2);
        }

        return hasSub(root1.left,root2.left)&&hasSub(root1.right,root2.right);
    }
}
