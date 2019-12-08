package stack;

import java.util.Stack;

/**
 * @author Zhangkj
 * @date 2019-12-08-17:13
 */

/**
 *
 用例:
 [1,2,3,4,5],[4,5,3,2,1]

 对应输出应该为:

 true
 */

public class JZIsPopOrder21 {


    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        int[] ints1 = {4,5,3,2,1};
        JZIsPopOrder21 jzIsPopOrder21 = new JZIsPopOrder21();

        boolean b = jzIsPopOrder21.IsPopOrder(ints, ints1);


        System.out.println(b);
    }




    /*
    这个题不能简单理解前后相等，，  进栈后可能出栈
     */
    public boolean IsPopOrder(int [] pushA,int [] popA) {


        Stack<Integer> stack = new Stack<>();

        int j=0;
        for (int i = 0; i < pushA.length; i++) {

            stack.push(pushA[i]);

            while(j<popA.length&&popA[j]==stack.peek()){
                stack.pop();
                j++;
            }
        }

        return stack.empty();


    }

    /*
    栈进去还可以出来   错的
     */
    public boolean IsPopOrder_1(int [] pushA,int [] popA) {



        for(int i=0,j=popA.length-1;i<=pushA.length/2;i++,j--){
            System.out.println(i);
            if(popA[i] == pushA[j]){
                continue;
            } else{
                return false;
            }
        }

        return true;
    }

}
