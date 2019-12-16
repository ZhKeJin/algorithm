package tree;

import java.util.HashMap;

/**
 * @author Zhangkj
 * @date 2019-12-16-17:03
 */
/*
重建二叉树
 */
public class Jz7 {

    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    // int[] prex = new int[];
    int count =0;
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {


        for(int i=0; i<in.length; i++){
            map.put(in[i],i);
        }
        //perx= pre;

        return reconstru(pre,0,pre.length);
    }
    public TreeNode reconstru(int [] pre,int l,int r) {

        if(l+1>r){
            return null;
        }

        int n = pre[count];
        int index = map.get(n);
        TreeNode root = new TreeNode(n);

        count++;

        root.left = reconstru(pre,l,index);
        root.right = reconstru(pre,index+1,r);


        return root;
    }


}
