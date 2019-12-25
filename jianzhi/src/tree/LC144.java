package tree;

/**
 * @author Zhangkj
 * @date 2019-12-25-12:44
 */

import java.util.*;

/**
 * 二叉树的先序
 */


public class LC144 {

    //先序
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if(root == null){

            return arrayList;

        }

        stack.push(root);

        while(!stack.isEmpty()){

            TreeNode node = stack.pop();

            arrayList.add(node.val);

            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }

        }



        return arrayList;

    }


    //中序
    public List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if(root == null){

            return arrayList;

        }

        TreeNode cur = root;

        while(cur!=null || !stack.isEmpty()){

            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }

            cur  = stack.pop();

            arrayList.add(cur.val);

            cur = cur.right;


        }

        return arrayList;


    }


    //后序
    public List<Integer> postorderTraversal(TreeNode root) {


        LinkedList<Integer> arrayList = new LinkedList<>();

        Stack<TreeNode> stack = new Stack<>();

        if(root == null){

            return arrayList;

        }

        stack.push(root);

        while(!stack.isEmpty()){


            TreeNode node = stack.pop();
            arrayList.addFirst(node.val);

            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }


        }

        return arrayList;


    }


    //层次遍历

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        if(root ==null){
            return list;
        }

        queue.add(root);
        while(!queue.isEmpty()){

            int count = queue.size();

            ArrayList<Integer> arrayList = new ArrayList<>();

            while(count!=0){

                TreeNode node = queue.poll();

                arrayList.add(node.val);

                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

                count--;

            }

            list.add(arrayList);

        }




        return list;
    }





}
