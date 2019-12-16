package tree;

/**
 * @author Zhangkj
 * @date 2019-11-10-20:06
 */
public class TreeNode {

    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode() {

    }

    public static void bianli(TreeNode root){

        if(root!=null){
            System.out.println(root.val);
            bianli(root.left);
            bianli(root.right);
        }

    }
}
