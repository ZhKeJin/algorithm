package other;

/**
 * @author Zhangkj
 * @date 2019-12-17-15:30
 */


import com.sun.org.apache.xml.internal.dtm.ref.sax2dtm.SAX2DTM2;
import sun.tracing.dtrace.DTraceProviderFactory;

/**
 * 替换空格
 */

public class Jz5 {

    public static void main(String[] args) {

        String string = new Jz5().replaceSpace(new StringBuffer("We Are Happy."));

        System.out.println(string);
    }

    public String replaceSpace(StringBuffer str) {


        int length = str.length();

        int count = 0;
        for (int i = 0; i < length; i++) {

            if(str.charAt(i) == ' '){

                count++;
            }
        }

        int newlength = length + 2*count;

        int p= newlength-1;
        int q= length-1;

        str.setLength(newlength);

        //str.tochar
        while(q>=0){

            while(q>=0&&str.charAt(q)!=' '){
                System.out.println(str.charAt(q));
                str.setCharAt(p,str.charAt(q));
                q--;
                p--;
            }

            if(q>=0) {
                q--;
                str.setCharAt(p--, '2');
                str.setCharAt(p--, '2');
                str.setCharAt(p--, '%');
            }

        }

        return str.toString();

    }
}
