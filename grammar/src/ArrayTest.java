import javafx.geometry.Pos;

/**
 * @author Zhangkj
 * @date 2019-07-25-20:43
 */
public class ArrayTest {

    public static void main(String[] args) {
        //数组
        //一维数组
        // 1
        int[] arr = new int[3];
        // 2
        int[] arr1 = {1,3,5,6};
        // 3
        int arr2[] = new int[]{2,3,4,5};

        System.out.println(arr[0]);
        System.out.println(arr2[2]);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }


        //二维数组

        //  1
        int[][] arr3 = new int[3][];
        arr3[0] = new int[]{2,2,2};
        arr3[1] = new int[4];
        System.out.println("arr3:"+arr3.length);  //3
        //  2   java.lang.ArrayIndexOutOfBoundsException  访问到数组中不存在的角标
        int[][] arr4 = new int[3][3];
        arr4[1][2]=5;
        System.out.println("arr4:"+arr4.length);  //3

        //  3
        int[][] arr5 = {{1,2,3},{2,3},{3,6,6}};
        System.out.println("arr5:"+arr5.length);  //3

        int[] arr6 = null;

        //NullPointerException
        //System.out.println(arr6[0]);

        //获取数组中的最值
        int[] ar = {1,3,42,4,65,45,61,5,6};

        //int MAX = getMax_1(ar);

        int MAX = getMax_2(ar);
        System.out.println(MAX);
        //selectSort(ar);
        bubbleSort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }

        System.out.println();

        int[] ar1 = {1,2,31,41,51,61,71,81};
        System.out.println(halfSearch_1(ar1,5));

        System.out.println("--------------------");

        main(3);

        toBin(6);

        toHex(-60);

        char[] cha = new char[4];  //初始化为'\u0000'
        for (int i = 0; i < cha.length; i++) {
            System.out.print(cha[i]+",");
        }
        System.out.println();

        toHex_2(-60);


    }


    //十进制——》十六进制   while 和if 的选择 很重要 设计
    private static void toHex_2(int num) {

        char[] cha = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        char[] chars = new char[8];
        int pos = 8;

        while(num!=0){

            chars[--pos] = cha[num&15];

            num = num>>>4;
        }

        for (int i = pos; i < chars.length; i++) {
            System.out.print(chars[i]);
        }

        System.out.println();

    }




    //十进制——》十六进制
    private static void toHex(int num) {

        StringBuffer sb = new StringBuffer();

        while(num!=0){

            int x = num & 15;//int x = num%16;
            if(x>=10){
                sb.append((char) (x-10+'A'));
            }else
                sb.append(x);
            num = num >>> 4;

        }

        System.out.println(sb.reverse());


    }

    //十进制-》二进制
    public static void toBin(int num){
        StringBuffer sb = new StringBuffer();

        while(num>0){

            int x = num & 1; //int x = num % 2;
            sb.append(x);
            num = num / 2;

        }

        System.out.println(sb.reverse());
    }


    //二分查找   循环条件的不同 程序会有所差异
    //如果要插入一个数字到有序数组  返回具体的下标  则返回mid 即可求出
    public static int halfSearch_1(int[] ar,int x){

        int max=ar.length-1,min=0,mid=0;
        while (min<=max){

            mid = (max+min)/2;
            if(ar[mid]<x)
                min = mid + 1;
            else if(ar[mid]>x)
                max = mid - 1;
            else
                return mid;
        }
        return mid;
    }

    //冒泡排序
    public static void bubbleSort(int[] ar){

        for (int i = 0; i < ar.length-1; i++) {
            for (int j = 0; j < ar.length - i - 1; j++) {
                if(ar[j]<ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] =temp;
                }
            }
        }
    }


    //选择排序
    public static void selectSort(int[] ar){


        for (int i = 0; i < ar.length-1; i++) {
            for (int j = i+1; j < ar.length; j++) {
                //ar[i] = ar[j];
                if(ar[j]>ar[i]){
                    int temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }


    }



    //求最值：利用数组中的值
    public static int getMax_1(int[] ar){

        int MAX=ar[0];
        for (int i = 1; i < ar.length; i++) {
            if(ar[i]>MAX){
                MAX = ar[i];
            }
        }
        return MAX;
    }

    //求最值：利用角标
    public static int getMax_2(int[] ar){
        int max=0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]>ar[max]){
                max = i;
            }

        }
        return ar[max];
    }


    public static int main(int a) {

        int[][] arr = {{1,1,2,3},{2,2,2,3},{4,4,55,5,5}};
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        return 0;
    }

}
