package array;



import java.util.*;

/**
 * @author Zhangkj
 * @date 2019-12-09-21:21
 */
public class JZzuixiaoK {


    public static void main(String[] args) {

        int[] ints = new int[]{4,5,1,6,2,7,3,8};

        PriorityQueue<Integer> integers = new PriorityQueue<>();



        ArrayList<Integer> integerArrayList = new JZzuixiaoK().GetLeastNumbers_Solution(ints, 4);

        Arrays.sort(ints);

        for (Integer integer : integerArrayList) {
            System.out.println(integer);
        }
    }


    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int length = input.length;
        if(k > length || k == 0){
            return result;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(input[i]);
            }
        }
        for (Integer integer : maxHeap) {
            result.add(integer);
        }
        return result;
    }








}
