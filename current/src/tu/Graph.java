package tu;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Zhangkj
 * @date 2019-12-03-9:59
 */

/**
 * 图的遍历
 */
public class Graph {
    //图的遍历

        // ----------------------------图的表示方式------------------------
        private int vertexSize;// 顶点的数量
        private int[] vertexs;// 顶点对应的数组
        private int[][] matrix;// 邻接矩阵
        private static final int MAX_WEIGHT = 1000;// 代表顶点之间不连通
        private boolean[] isVisited; // 顶点是否已经被访问

        public Graph(int vertexSize) {
            this.vertexSize = vertexSize;
            this.matrix = new int[vertexSize][vertexSize];
            this.vertexs = new int[vertexSize];
            for (int i = 0; i < vertexSize; i++) {
                vertexs[i] = i;
            }

            isVisited = new boolean[vertexSize];
        }
        // ----------------------------图的表示方式------------------------

        // ----------------------------两个重要方法------------------------
        // 获取某个顶点的第一个邻接点
        public int getFirstNeighbor(int index) {
            for (int i = 0; i < vertexSize; i++) {
                if (matrix[index][i] > 0 && matrix[index][i] != 1000) {
                    return i;
                }
            }
            return -1; // 如果没有第一个邻接点,则返回-1
        }

        // 获取某个节点V当前邻接点index的下一个邻接点
        public int getNextNeighbor(int v, int index) {
            for (int i = index + 1; i < vertexSize; i++) {
                if (matrix[v][i] > 0 && matrix[v][i] != 1000) {
                    return i;
                }
            }
            return -1; // 如果没有返回-1
        }
        // ----------------------------两个重要方法------------------------

        // 图的深度优先遍历算法 ---- 从顶点i进行遍历
    // 递归实现
        private void depthFirstSearch(int i) {
            // 开始遍历顶点i---所以将其标记为已经遍历了
            isVisited[i] = true;
            // 遍历顶点i的第一个邻接点
            int FN = getFirstNeighbor(i);
            while (FN != -1) {// 如果第一个邻接点存在
                if (!isVisited[FN]) { // 且第一个邻接点没被遍历遍历过
                    System.out.println("遍历到了" + FN + "顶点"); // 遍历该顶点
                    // 同时递归遍历该顶点的邻接点
                    depthFirstSearch(FN);
                }

                // 如果第一个邻接点已经遍历过了---则遍历其第一个邻接点后面的邻接点
                FN = getNextNeighbor(i, FN);
            }

        }

        // 对外提供的深度优先遍历
        public void depthFirstSearch() {
            // 假如图为有向图-----可能遍历到一定程度就再也走不通了
            // 如我例子中的节点2---所以需要对每一个节点进行一下循环
            for (int i = 0; i < vertexSize; i++)
                if (!isVisited[i]) {
                    System.out.println("遍历到了" + i + "顶点");
                    depthFirstSearch(i);
                }

        }

     //*********************************************************************

        // 对外提供的广度优先遍历
    // 用到层次遍历 队列实现
        public void broadFirstSearch() {
            // 假如图为有向图-----可能遍历到一定程度就再也走不通了
            // 如我例子中的节点2---所以需要对每一个节点进行一下循环
            for (int i = 0; i < vertexSize; i++)
                if (!isVisited[i]) {
                    broadFirstSearch(i);
                }

        }

        private void broadFirstSearch(int i) {
            Queue<Integer> queue = new LinkedList<>();
            // 将遍历到的i压人队列中
            queue.add(i);
            isVisited[i] = true; // 标记该顶点已经被遍历过
            System.out.println("遍历到了" + i + "顶点");
            while (!queue.isEmpty()) {
                // 弹出队首的元素
                Integer head = queue.poll();
                // 获取队首元素第一个邻接点的元素
                int FN = getFirstNeighbor(head);
                while (FN != -1) { // 如果有第一个邻接点
                    if (!isVisited[FN]) {// 且该邻接点没有被访问过
                        isVisited[FN] = true;// 标记该顶点已经被遍历过
                        System.out.println("遍历到了" + FN + "顶点");
                        queue.add(FN); // 让FN进人队列
                    }
                    // 遍历队列首元素head基于FN的下一个元素
                    FN = getNextNeighbor(head, FN);
                }
            }

        }

        public static void main(String[] args) {
            Graph graph = new Graph(6);
            int[] v0 = { 0, 4, MAX_WEIGHT, 7, 2, MAX_WEIGHT };
            int[] v1 = { MAX_WEIGHT, 0, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 3 };
            int[] v2 = { MAX_WEIGHT, 9, 0, 5, 6, MAX_WEIGHT };
            int[] v3 = { MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 0, MAX_WEIGHT, MAX_WEIGHT };
            int[] v4 = { MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 0, MAX_WEIGHT };
            int[] v5 = { MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, MAX_WEIGHT, 1, 0 };

            graph.matrix[0] = v0;
            graph.matrix[1] = v1;
            graph.matrix[2] = v2;
            graph.matrix[3] = v3;
            graph.matrix[4] = v4;
            graph.matrix[5] = v5;
            // 深度优先遍历测试
            // graph.depthFirstSearch(); // 0 1 5 4 3 2

            // 广度优先遍历测试
            graph.broadFirstSearch();// 0 1 3 4 5 2
        }
}


