package tree;

/**
 * @author Zhangkj
 * @date 2019-12-08-15:35
 */

public class JZMirror {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode root1 = new TreeNode(6);
        TreeNode root2 = new TreeNode(10);
        TreeNode root3 = new TreeNode(5);
        TreeNode root4 = new TreeNode(7);
        TreeNode root5 = new TreeNode(9);
        TreeNode root6 = new TreeNode(11);

        root.left = root1;
        root.right = root2;
        root1.left = root3;
        root1.right = root4;
        root2.left = root5;
        root2.right = root6;

        TreeNode.bianli(root);

        JZMirror jzMirror = new JZMirror();

//        jzMirror.Mirror(root);
        jzMirror.Mirror_2(root);
        TreeNode.bianli(root);
    }

    /**
     * 操作给定的二叉树，将其变换为源二叉树的镜像。
     */

    public void Mirror_2(TreeNode root) {


        if(root == null){
            return;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        Mirror_2(root.left);
        Mirror_2(root.right);

    }




    public TreeNode Mirror_1(TreeNode root) {

        if(root==null){
            return null;
        }

        if(root.left!=null){
            root.right = Mirror_1(root.left);
        }

        if(root.right!=null){
            root.left = Mirror_1(root.right);
        }



        return root;


    }

    public void Mirror(TreeNode root) {

        TreeNode treeNode = Mirror_1(root);
        //TreeNode.bianli(treeNode);
    }




}
