package link;


import sun.reflect.generics.tree.Tree;

import java.util.Date;

/**
 * @author Zhangkj
 * @date 2019-11-08-23:26
 */
public class LinkDemo {

    public static void main(String[] args) {


//        LinkedList;

        Node node = new Node();
        Node head = new Node(3);
        Node n1 = new Node(2);
        Node n2 = new Node(2);
        Node n3 = new Node(2);
        Node n4 = new Node(2);
        Node n5 = new Node(2);


        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        node = head;
        while (node != null) {

            System.out.println(node.data);
            node = node.next;
        }


        node = new Node(9);

        System.out.println(node.data);


        TreeNode root = new TreeNode(4);
        TreeNode root1 = new TreeNode(3);
        TreeNode root2= new TreeNode(7);
        TreeNode root3 = new TreeNode(2);
        TreeNode root4 = new TreeNode(1);
        TreeNode root5 = new TreeNode(5);

        root.left = root1;
        root.right = root2;
        root2.left = root3;
        root2.right = root4;
        root1.right =root5;


        modsearch(root);


    }


    public static void modsearch(TreeNode treeNode){

        if(treeNode!=null){
            modsearch(treeNode.left);
            modsearch(treeNode.right);
            System.out.println(treeNode.data);
        }
    }
}


class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
    }

}


class Node {

    int data;
    Node next;


    public Node(int data) {
        this.data = data;
    }

    public Node() {
    }


//    public void addTail(Node node) {
//
//        Node pNode = head;
//
//        while (pNode != null) {
//            pNode = head.next;
//        }
//        pNode = node;
//
//    }
//
//
//    public void getNode() {
//
//        Node pNode;
//        for (pNode = head; head.next != null; pNode = head.next) {
//
//            System.out.println(pNode.data);
//        }
//    }


}

