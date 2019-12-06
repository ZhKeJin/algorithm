package tree;

/**
 * @author Zhangkj
 * @date 2019-12-06-11:19
 */

import jdk.nashorn.internal.ir.ReturnNode;

import javax.swing.plaf.synth.SynthRootPaneUI;

/**
 * 输入: [1,2,3]
 *     1
 *    / \
 *   2   3
 * 输出: 25
 * 解释:
 * 从根到叶子节点路径 1->2 代表数字 12.
 * 从根到叶子节点路径 1->3 代表数字 13.
 * 因此，数字总和 = 12 + 13 = 25.
 *
 *
 */
public class Leedcode129 {


    public static void main(String[] args) {
        Leedcode129 leedcode129 = new Leedcode129();

        TreeNode root = new TreeNode(1);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(3);

        root.left = root1;
        root.right = root2;

        int i = leedcode129.sumNumbers_1(root);
        System.out.println(i);

    }

    //这个题还可用非递归的思想，用栈，采用中序遍历的思想


    /**
     * 回溯：进行深度遍历 ，计算出当前到叶节点的值，然后在回溯到上一个位置，继续进行深度，重复该过程，直到没有节点为止
     */
    int sum =0;

    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }

        dfs(root, root.val);

        return sum;

    }
    private void dfs(TreeNode root,int cursum) {

        if(root.right==null&&root.left==null){
            sum = sum + cursum;

            return ;

        }

        if(root.left!=null){
            dfs(root.left,cursum*10+root.left.val);
        }

        if(root.right!=null){
            dfs(root.right,cursum*10+root.right.val);

        }


    }


    /**
     * 分治的思想：将大问题细化为小问题，将最后的解 化解为 求左右分支 的和
     * @param root
     * @return
     */
    public int sumNumbers_1(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum =0;
        return getcursum(root,sum);

    }

    private int getcursum(TreeNode root, int sum) {

        sum = sum*10+root.val;
        if(root.right==null&&root.left==null){
            return sum;
        }

        int ans =0;
        if(root.left!=null){
            ans+= getcursum(root.left,sum);
        }

        if(root.right!=null){
            ans+= getcursum(root.right,sum);

        }

        return ans;

    }


}
