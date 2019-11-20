package digui;

import javax.print.attribute.standard.NumberOfInterveningJobs;

/**
 * @author Zhangkj
 * @date 2019-11-20-14:42
 */
public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(Fibonacci(6));
        System.out.println(Fibonacci_1(6));
    }

    public static int Fibonacci(int n) {


        if (n == 0 || n == 1) {
            return n;
        }


        return Fibonacci(n - 1) + Fibonacci(n - 2);

    }


    public static int Fibonacci_1(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int i = 0;
        int j = 1, t;
        int k = 2;
        while (k <= n) {
            t = j;
            j = i + j;
            i = t;
            k++;
        }

        return j;
    }
}
