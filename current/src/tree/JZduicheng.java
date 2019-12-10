package tree;



/**
 * @author Zhangkj
 * @date 2019-12-09-23:07
 */


/**
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */


public class JZduicheng {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(9);
        TreeNode root3 = new TreeNode(2);
        TreeNode root4 = new TreeNode(7);
        TreeNode root5 = new TreeNode(1);
        TreeNode root6 = new TreeNode(2);

        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left= root5;
        root2.right = root6;

        System.out.println(new JZduicheng().isSymmetrical(root));

    }

    boolean isSymmetrical(TreeNode pRoot) {

        if(pRoot==null){
            return true;

        }
        return isSymmetrical_1(pRoot.left,pRoot.right);
    }

    private boolean isSymmetrical_1(TreeNode left, TreeNode right) {

        if(left==null&&right!=null){
            return false;
        }
        if(left!=null&&right==null){
            return false;
        }
        if(left==null&&right==null){
            return true;
        }

        if(left.val!=right.val){
            return false;
        }

        if(left.val==right.val){
            return isSymmetrical_1(left.left,right.right)&&isSymmetrical_1(left.right,right.left);
        }

        return true;


    }


}
