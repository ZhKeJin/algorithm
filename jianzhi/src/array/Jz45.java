package array;

/**
 * @author Zhangkj
 * @date 2019-12-14-20:04
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 *   把数组排成最小的数
 */

public class Jz45 {


    public static void main(String[] args) {

        String string = new Jz45().PrintMinNumber(new int[]{3, 32, 321});

        System.out.println(string);

    }

    public String PrintMinNumber(int [] numbers) {


        int n;
        String s="";
        ArrayList<String> list= new ArrayList<String>();
        n=numbers.length;
        for(int i=0;i<n;i++){
            list.add(String.valueOf(numbers[i]));

        }
//        Collections.sort(list, new Comparator<Integer>(){
//
//            public int compare(Integer str1,Integer str2){
//                String s1=str1+""+str2;
//                String s2=str2+""+str1;
//                return s1.compareTo(s2);
//            }
//        });

        //降序
        Collections.sort(list);

        for (int i = list.size()-1; i >=0 ; i--) {
            s+=list.get(i);

        }

        return s;

    }

    public String PrintMinNumber_1(int [] numbers) {
        int n;
        String s="";
        ArrayList<Integer> list= new ArrayList<Integer>();
        n=numbers.length;
        for(int i=0;i<n;i++){
            list.add(numbers[i]);

        }
        Collections.sort(list, new Comparator<Integer>(){

            public int compare(Integer str1,Integer str2){
                String s1=str1+""+str2;
                String s2=str2+""+str1;
                return s1.compareTo(s2);
            }
        });

        for(int j:list){
            s+=j;
        }
        return s;

    }




}
