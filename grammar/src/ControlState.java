/**
 * @author Zhangkj
 * @date 2019-07-25-13:11
 */
public class ControlState {

    public static void main(String[] args) {

        int a = 1;

        //if else
        if(a<3){
            System.out.println(a);
        }else{
            System.out.println(a+1);
        }

        if(a<3){
            System.out.println(a);
        }else if(a<3){
            System.out.println(a+2);
        }else{
            System.out.println(a+1);
        }



        //switch case   结束条件 ：遇到break 或 } 否则依次执行
        int x=4;

        switch(x){
            default:
                System.out.println(x+3);
                //break;
            case 1:
                System.out.println(x);
                //break;
            case 3:
                System.out.println(x+1);
                break;
            case 2:
                System.out.println(x+2);
                break;

        }

        //while
        int w=4;

        while(w<9){

            System.out.println(w);
            w++;

        }
        System.out.print(w);
        //do while
        do{
            System.out.println(w);
            w++;
        }while(w<10);


        //for  第二部分为 条件表达式  真执行  假退出  真假不确定 就编译出错
        for (int i = 0; i < 3; i++) {
            System.out.println("i="+i);
        }

        // i 只在for循环中存在
        //System.out.println("i="+i);

        //累加
        int sum = 0;

        int q=1;
        while(q<=3){
            sum += q;
            q++;
        }

        System.out.println("sum"+sum);

        //找出1——100中的7的倍数
        int count=0;

        for(int i=1;i<=100;i++){

            if(i%7 == 0)
                count++;
        }

        System.out.println("count"+count);

        int e=1,cou=0;
        while(e<=100){

            if(e%7 ==0) cou++;
            e++;
        }
        System.out.println("cou="+cou);
       // ****
       // ***
       // **
       // *
        for (int y = 0; y < 4; y++) {
            for (int r = 0; r < 4-y; r++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //*
        //**
        //***
        //****

        for (int y = 0; y < 4; y++) {
            for (int r = 0; r < y+1; r++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //break
        System.out.println("------------");
        t:for (int y = 0; y < 4; y++) {
            u:for (int r = 0; r < 3; r++) {
                System.out.print("y="+y);
                break u;
            }
            System.out.println();
        }

        //continue
        for (int z = 0; z <= 10; z++) {
            if(z%2==1)
                continue;
            System.out.println(z);


        }

      //  等边三角形
      //      *
      //     * *
      //    * * *
      //   * * * *
      //  * * * * *
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {

                System.out.print(" ");
            }

            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("——————————————");


    }

}
