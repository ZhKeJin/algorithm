package stack;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2019-09-04-20:10
 */
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        char[] data = string.toCharArray();
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < data.length; i++) {
            if(data[i] == '('){
                stack.addFirst(i);
                continue;
            }
            if(data[i] == ')'){
                if(stack.isEmpty()) {
                    System.out.println("");
                    return;
                }
                exrp(data,stack.removeFirst()+1,i-1);
            }

        }
        if(!stack.isEmpty()) {
            System.out.println("");
            return;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            if(data[i] == '(' || data[i] ==')')
                continue;
            result.append(data[i]);
        }
        System.out.println(result.toString());
    }

    private static void exrp(char[] data, int start, int end) {
        while(end > start){
            char temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            end--;
            start++;
        }

    }
}
