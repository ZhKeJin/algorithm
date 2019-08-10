package string;

import com.sun.imageio.plugins.common.I18N;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.invoke.MethodHandle;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2019-07-30-21:12
 */
public class LuoToInt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        System.out.println(new LuoToInt().romanToInt(string));
    }


    public int romanToInt(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);


        int sum=0;

        for (int i = 0; i < s.length(); i++) {

            if(i!=s.length()-1){

                if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){

                sum = sum + hm.get(s.charAt(i+1))-hm.get(s.charAt(i));

                i++;
                continue;
              }
            }
                sum  = sum + hm.get(s.charAt(i));

        }
        return sum;
    }

}
