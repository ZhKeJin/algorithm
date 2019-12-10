package tree;

import jdk.nashorn.internal.ir.ReturnNode;

/**
 * @author Zhangkj
 * @date 2019-12-09-20:04
 */
public class JZHasSubtree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(15);
        TreeNode root4 = new TreeNode(7);
        TreeNode root5 = new TreeNode(24);

        root.left = root1;
        root.right = root2;
        root2.left = root3;
        root2.right = root4;
        root3.left = root5;

       // TreeNode roo1 = new TreeNode(3);
        //TreeNode ro1 = new TreeNode(9);
        TreeNode ro2 = new TreeNode(20);
        TreeNode ro3 = new TreeNode(15);
        //TreeNode ro4 = new TreeNode(7);
        TreeNode ro5 = new TreeNode(24);

        //roo1.left = ro1;
        //roo1.right = ro2;
        ro2.left = ro3;
        //ro2.right = ro4;
        ro3.left = ro5;


        JZHasSubtree jzHasSubtree = new JZHasSubtree();

        System.out.println(jzHasSubtree.HasSubtree(root,ro2));
        System.out.println(jzHasSubtree.HasSubtree_2(root,ro2));

    }


    public boolean HasSubtree_1(TreeNode root1,TreeNode root2) {

        if (root1 == null && root2 != null) {
            return false;
        }

        if (root2 == null && root1 != null) {
            return false;
        }

//        if(root1 == root2)
//            return HasSubtree(root1.left ,root2.left)&&HasSubtree(root1.right ,root2.right);
//        if(root1.left == root2)
//            return HasSubtree(root1.left.left ,root2.left)&&HasSubtree(root1.right.right , root2.right);
//        if(root1.right == root2)
//            return HasSubtree(root1.right.left , root2.left)&&HasSubtree(root1.right.right , root2.right);

        return true;
    }


    /*
    子结构：包含子树
     */
    public boolean doesTree1HasTree2(TreeNode tree1, TreeNode tree2){
        if ( tree2 == null ){
            return true;
        }
        if ( tree1 == null ){
            return false;
        }

        if ( tree1.val != tree2.val ){
            return false;
        }
        return doesTree1HasTree2(tree1.left, tree2.left) && doesTree1HasTree2(tree1.right, tree2.right);
    }

    public  boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if ( root2 == null || root1 == null){
            return false;
        }
        return doesTree1HasTree2(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    /*
       子树：从根节点的左右的两支的其中的一支
        */
    public boolean HasSubtree_2(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return judgeSubTree(root1, root2) ||
                judgeSubTree(root1.left, root2) ||
                judgeSubTree(root1.right, root2);
    }

    private boolean judgeSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null && root1==null) {
            return true;
        }
        if (root1 == null && root2!=null) {
            return false;
        }
        if (root2 == null && root1!=null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return judgeSubTree(root1.left, root2.left) &&
                judgeSubTree(root1.right, root2.right);
    }


    /*
    子结构
     */
    public boolean HasSubtree_3(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        return judgeSubTree(root1, root2) ||
                judgeSubTree(root1.left, root2) ||
                judgeSubTree(root1.right, root2);
    }

    private boolean judgeSubTree_3(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return judgeSubTree_3(root1.left, root2) ||
                    judgeSubTree_3(root1.right, root2);
        }
        return judgeSubTree_3(root1.left, root2.left) &&
                judgeSubTree_3(root1.right, root2.right);
    }




}
