package other;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/**
 * @author Zhangkj
 * @date 2019-12-21-21:03
 */

//环的问题
public class Jz62 {


    public static void main(String[] args) {

        int i = new Jz62().LastRemaining_Solution(5, 3);
        System.out.println(i);
    }

    public int LastRemaining_Solution(int n, int m) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }

        int cur =-1;
   //     int p = m%arrayList.size();
        while(arrayList.size()>1){

            for (int i = 0; i < m; i++) {
                cur++;
                if(cur==arrayList.size()){
                    cur=0;
                }
            }

            arrayList.remove(cur);
            cur--;
//            System.out.println(cur);
        }

        return arrayList.get(0);

    }


}
