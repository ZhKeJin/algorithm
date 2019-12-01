import java.util.SortedMap;

/**
 * @author Zhangkj
 * @date 2019-11-28-22:35
 */
public class Kuaipai {

    public static void main(String[] args) {

        int[] ints = new int[]{2,3,4,6,7,4,6,7};


        quicksort(ints,0,ints.length-1);

        for (int anInt : ints) {

            System.out.println(anInt);
        }
    }

    private static void quicksort(int[] ints,int left,int right) {

        if(left>right){
            return ;

        }
        int str = ints[left];
        int l = left;
        int r = right;



        while(l!=r) {

            while (ints[r] >= str && l<r) {
                r--;
            }
            while (ints[l] <= str && l<r) {
                l++;
            }

            if(l<r){
                int temp = ints[l];
                 ints[l] = ints[r];
                 ints[r] = temp;
            }

        }

        ints[left] = ints[l];

        ints[l] = str;
        quicksort(ints,left,l-1);
        quicksort(ints,l+1,right);


//        int i,j,t,temp;
//        if(left>right)
//            return;
//
//        temp=a[left]; //temp中存的就是基准数
//        i=left;
//        j=right-1;
//        while(i!=j)
//        {
//            //顺序很重要，要先从右边开始找
//            while(a[j]>=temp && i<j)
//                j--;
//            //再找右边的
//            while(a[i]<=temp && i<j)
//                i++;
//            //交换两个数在数组中的位置
//            if(i<j)
//            {
//                t=a[i];
//                a[i]=a[j];
//                a[j]=t;
//            }
//        }
//        //最终将基准数归位
//        a[left]=a[i];
//        a[i]=temp;
//
//        quicksort(a,left,i-1);//继续处理左边的，这里是一个递归的过程
//        quicksort(a,i+1,right);//继续处理右边的 ，这里是一个递归的过程
    }


}
