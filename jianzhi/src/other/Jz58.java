package other;

/**
 * @author Zhangkj
 * @date 2019-12-17-16:12
 */

/**
 * 翻转字符串
 */
public class Jz58 {


    public static void main(String[] args) {
//        String string = new Jz58().ReverseSentence("I am a student.");
        String string = new Jz58().ReverseSentence_1("I am a student.");

        System.out.println(string);
    }

    public String ReverseSentence(String str) {
        if(str.equals(" ")){
            return "";

        }

        str = new StringBuffer(str).reverse().toString();

        String revers = revers(str);

        System.out.println(revers);


        String[] arr = revers.split(" ");
        String reverse = "";
        for (int i = 0; i < arr.length; i++) {
            String revers1 = revers(arr[i]);
            reverse = reverse+revers1+" ";
        }



        return reverse.substring(0,reverse.length()-1);

    }

    public String revers(String arr){
        String reverse = "";
        for (int i = 0; i < arr.length(); i++) {
            reverse = arr.charAt(i) + reverse;
        }
        return reverse;

    }


    public String ReverseSentence_1(String str) {
        if(str.equals("")){
            return new String();

        }
        String string = "";
        System.out.println(string.equals(new String()));

        str = new StringBuffer(str).reverse().toString();



        String[] arr = str.split(" ");
        String reverse = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuffer(arr[i]).reverse().toString();
            reverse = reverse+arr[i]+" ";
        }



        return reverse.substring(0,reverse.length()-1);

    }


}
