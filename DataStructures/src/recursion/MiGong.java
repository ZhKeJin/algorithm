package recursion;

import sun.text.resources.cldr.es.FormatData_es_419;

/**
 * @author Zhangkj
 * @date 2019-08-01-11:53
 */
public class MiGong {

    public static void main(String[] args) {

        int[][] ar = new int[8][7];

        for (int i = 0; i < ar.length; i++) {
            ar[i][0] = 1;
            ar[i][6] = 1;
        }

        for (int i = 0; i < ar[0].length; i++) {
            ar[0][i] = 1;
            ar[7][i] = 1;
        }

         ar[3][1]=1;
         ar[3][2]=1;
         ar[3][4]=1;
         ar[4][3]=1;
         ar[2][4]=1;
       //  ar[1][3]=1;


        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {

                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }


        setWay(ar, 1, 1);

        System.out.println();

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[0].length; j++) {

                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }


    }



    //使用递归回溯来给小球找路
    //说明
    //1. map 表示地图
    //2. i,j 表示从地图的哪个位置开始出发 (1,1)
    //3. 如果小球能到 map[6][5] 位置，则说明通路找到.
    //4. 约定： 当map[i][j] 为 0 表示该点没有走过 当为 1 表示墙  ； 2 表示通路可以走 ； 3 表示该点已经走过，但是走不通
    //5. 在走迷宫时，需要确定一个策略(方法) 下->右->上->左 , 如果该点走不通，再回溯
    /**
     *
     * @param map 表示地图
     * @param i 从哪个位置开始找
     * @param j
     * @return 如果找到通路，就返回true, 否则返回false
     */
    public static boolean setWay(int[][] map, int i, int j) {
        if(map[6][5] == 2) { // 通路已经找到ok
            return true;
        } else {
            if(map[i][j] == 0) { //如果当前这个点还没有走过
                //按照策略 下->右->上->左  走
                map[i][j] = 2; // 假定该点是可以走通.
                if(setWay(map, i+1, j)) {//向下走
                    return true;
                } else if (setWay(map, i, j+1)) { //向右走
                    return true;
                } else if (setWay(map, i-1, j)) { //向上
                    return true;
                } else if (setWay(map, i, j-1)){ // 向左走
                    return true;
                } else {
                    //说明该点是走不通，是死路
                    map[i][j] = 3;
                    return false;
                }
            } else { // 如果map[i][j] != 0 , 可能是 1， 2， 3
                return false;
            }
        }
    }


}
