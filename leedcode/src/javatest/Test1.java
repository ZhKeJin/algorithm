package javatest;

/**
 * @author Zhangkj
 * @date 2020-01-05-17:07
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Test1 {

        public static void main(String[] args){
            String[] sArray = new String[5];
            Integer[] intArray = new Integer[5];
            Scanner input = new Scanner(System.in);
            for(int i=0;i<sArray.length;i++)  {
                sArray[i] = input.next();
            }

            for(int i=0;i<intArray.length;i++)  {
                intArray[i] = new Integer(input.nextInt());
            }

            System.out.println("Max string is " +(String)max(sArray));
            System.out.println("Max integer is " + (Integer)max(intArray));
        }


        public static Object max_1(Comparable[] a) {
            int N=a.length;
            Comparable t;
            for(int i=0;i<N;i++)
            {
                int min=i;
                for(int j=i+1;j<N;j++)
                    if(a[j].compareTo(a[min])>0) min=j;
                t=a[i];
                a[i]=a[min];
                a[min]=t;
            }
            return a[0];
        }

        public static Object max(Comparable[] a) {

            Comparable comparable = a[0];
            for (int i = 1; i < a.length; i++) {

                    if(a[i].compareTo(comparable)>0){
                        comparable = a[i];

                    }
            }

            return comparable;

        }

}



