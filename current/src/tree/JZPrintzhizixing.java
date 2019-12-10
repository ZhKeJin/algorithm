package tree;

import jdk.nashorn.internal.ir.Flags;
import jzoffer.JZFirstNotRepeatingChar;
import java.util.*;


/**
 * @author Zhangkj
 * @date 2019-12-10-18:04
 */


/*
例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 */
public class JZPrintzhizixing {

//
//    static ArrayList<ArrayList<Integer>> print;
//     static LinkedList<TreeNode> linkedList = null;


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode root1 = new TreeNode(9);
        TreeNode root2 = new TreeNode(20);
        TreeNode root3 = new TreeNode(15);
        TreeNode root4 = new TreeNode(7);


        root.left = root1;
        root.right = root2;
        root2.left = root3;
        root2.right = root4;
        ArrayList<ArrayList<Integer>> print = new ArrayList<>();



        JZPrintzhizixing jzPrintzhizixing = new JZPrintzhizixing();

//        print = jzPrintzhizixing.Print(root);
        print = jzPrintzhizixing.Print_1(root);

        for (ArrayList<Integer> arrayList : print) {
            System.out.println(Arrays.toString(arrayList.toArray()));

        }

//        LinkedList linkedList = new LinkedList();
//        linkedList.offer(3);
//        linkedList.offer(4);
//        linkedList.offer(5);
//        linkedList.offer(1);
//
//        for (Object o : linkedList) {
//            System.out.println(o);
//        }


    }


    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> print = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        if(pRoot==null){
            return print;
        }

        linkedList.add(pRoot);

        boolean flag = true;
        while(!linkedList.isEmpty()){

            int size = linkedList.size();


            ArrayList<Integer> treeNodes = new ArrayList<>();

            for (int i = 1; i <= size; i++) {

                TreeNode peek = linkedList.poll();

                if(flag){
                    treeNodes.add(peek.val);
                }else{
                    treeNodes.add(0, peek.val);
                }


                if(peek.left!=null){
                    linkedList.offer(peek.left);
                }
                if(peek.right!=null){
                    linkedList.offer(peek.right);
                }

            }

            flag =!flag;
            print.add(treeNodes);

        }

        return print;

    }

    public ArrayList<ArrayList<Integer>> Print_1(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> print = new ArrayList<>();

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();


        if(pRoot==null){
            return print;
        }

        stack1.push(pRoot);

        while(!stack1.isEmpty()||!stack1.isEmpty()) {


           if (!stack1.empty()) {
               ArrayList<Integer> treeNodes = new ArrayList<>();
               while (!stack1.empty()) {
                    TreeNode pop = stack1.pop();

                    if (pop.left != null) {
                        stack2.push(pop.left);
                    }
                    if (pop.right != null) {
                        stack2.push(pop.right);
                    }

                    treeNodes.add(pop.val);

                }
                print.add(treeNodes);
            }

            if (!stack2.empty()) {
                ArrayList<Integer> treeNodes1 = new ArrayList<>();
                while (!stack2.empty()) {

                    TreeNode pop = stack2.pop();

                    if (pop.right != null) {
                        stack1.push(pop.right);
                    }
                    if (pop.left != null) {
                        stack1.push(pop.left);
                    }

                    treeNodes1.add(pop.val);

                }

                print.add(treeNodes1);

            }
        }



        return print;

    }
}
