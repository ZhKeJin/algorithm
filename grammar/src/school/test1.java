package school;

import sun.security.provider.Sun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * @author Zhangkj
 * @date 2019-10-14-9:13
 */
public class test1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String demo = scanner.nextLine();

        char[] chars = demo.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }


}


class Main {

    public static void main(String[] args) {
        int[] arr = new int[100];


        Scanner scanner = new Scanner(System.in);

        float max = 0, min = 0;
        for (int i = 0; i < 100; i++) {
            arr[i] = scanner.nextInt();

            if (i == 0)
                min = arr[i];

            if (arr[i] == -1) {
                System.out.println("Max:" + max + " kg");
                System.out.println("Min:" + min + " kg");
                break;
            }

            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }


    }


}



class Main22 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float max = 0, min = a;
        while(a>0){

            if (a > max)
                max = a;
            if (a < min)
                min = a;
            a = scanner.nextInt();
        }

        System.out.println("Max:" + max + " kg");
        System.out.println("Min:" + min + " kg");
    }


}


class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");


        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            float x1, x2;

            double d = b * b - 4 * a * c;

            double e, f;

            if (d == 0) {


                e = f = -b / 2 * a;

                System.out.println("x=" + df.format(e));


            } else if (d < 0) {

                System.out.println("无效根");

            } else {


                double g = Math.sqrt(Math.abs(b));

                e = -(b + g) / 2 * a;

                f = -(e);

                System.out.println("x1=" + df.format(e) + ",x2=" + df.format(f));


            }
        }


//        if(a==0){
//            System.out.println("x=" + df.format(-b/c));
//
//        }
//
//        if((b * b - 4 * a * c)<0) {
//            System.out.println("无解");
//            return;
//        }
//        x1 = (float) ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
//        x2 = (float) ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
//
//        if (x1 == x2) {
//            System.out.println("x=" + df.format(x1));
//        } else
//            System.out.println("x1=" + df.format(x1) + ",x2=" + df.format(x2));


    }


}



class Main4{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        while (true) {
            int n = scanner.nextInt();

            int a=1,b=2,t;
            double sum = 0;


            for (int i = 0; i < n; i++) {

                sum += (double) b / a;

                t = b;

                b = a + b;
                a = t;

            }
            System.out.printf("%.6f\n", sum);

        }


    }

}


class Main42{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            int i = scanner.nextInt();
            double sum = 0;
            int fz=2,fm=1,t;
            while(i--!=0){
                sum+=((double)fz/fm);
                t=fz;
                fz+=fm;
                fm=t;
            }
            System.out.printf("%.6f\n",sum);

        }
    }
}

