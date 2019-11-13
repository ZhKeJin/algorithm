package tree;


import java.util.HashMap;

/**
 * @author Zhangkj
 * @date 2019-11-11-10:57
 */
public class Leedcode106 {

    HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();

    int[] per;
    int[] in ;
    int perind=0;
    public static void main(String[] args) {

        Leedcode105 leedcode105 = new Leedcode105();
        int[] per = {3,9,20,15,7};
        int[] in = {9,3,15,20,7 };

        TreeNode.bianli(leedcode105.buildTree(per,in));


    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        per = preorder;
        in = inorder;

        TreeNode root=null;

        int inx = 0;
        for (int i : inorder) {

            integerIntegerHashMap.put(i,inx++);
        }

//        for (Integer integer : integerIntegerHashMap.keySet()) {
//            Integer integer1 = integerIntegerHashMap.get(integer);
//            System.out.println(integer+"        "+integer1);
//        }
//
//        System.out.println(inorder.length);

        return root;
    }



}
