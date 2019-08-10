import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2019-08-09-16:12
 */
public class Leedcode509 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(new Leedcode509().fib(n));


    }

    public int fib(int N) {
         if(N==1){
             return 1;
         }
         if(N==0){
             return 0;
         }

         return fib(N-1)+fib(N-2);
    }


}
