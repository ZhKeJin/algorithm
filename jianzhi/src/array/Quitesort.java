package array;

import com.sun.deploy.panel.ITreeNode;

import java.beans.IntrospectionException;

/**
 * @author Zhangkj
 * @date 2019-12-15-15:19
 */
public class Quitesort {

    public static void main(String[] args) {


    }


    public  int sort(int a[], int l, int r){


        int index= a[l];
        while(l<r){

            while(a[r]>index&&r>l){
                r--;
            }
            while(a[l]<index&&l<r){
                l++;
            }

            if(l<r){
                int temp = a[l];
                a[l] = a[r];
                a[r] = temp;
            }



        }
        return 0;

    }

}
