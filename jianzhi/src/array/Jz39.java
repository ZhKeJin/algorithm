package array;

/**
 * @author Zhangkj
 * @date 2019-12-15-16:17
 */



/**
 * 数组中出现次数超过一半的数字
 */
public class Jz39 {


    public static void main(String[] args) {

        int search = new Jz39().search(new int[]{1,2,3,2,4,2,5,2,3});

        System.out.println(search);
    }

    public int search(int[] arr){


        if(arr.length%2==0){
            return 0;
        }

        int count =0;
        int index = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(count==0){
                count =1;
                index = arr[i];
            }else if(index != arr[i]){
                count--;
            }else{
                count++;
            }
            System.out.println(count);

        }

        int n=0;
        for (int i = 0; i < arr.length; i++) {

            if(index == arr[i]) n++;

        }
        if(n<arr.length/2){
            return 0;
        }


        return index;


    }

}
