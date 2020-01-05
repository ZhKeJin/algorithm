import com.sun.xml.internal.bind.v2.model.annotation.FieldLocatable;
import sun.text.UCompactIntArray;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;

/**
 * @author Zhangkj
 * @date 2019-12-31-9:21
 */
abstract public class Parent {


    abstract  void doSome()throws IOException, SQLException;

    abstract  void doWome()throws IOException, SQLException;

    public int getNum(){return 0;};
}

interface Grant{

    int fun1(int a,int b);
}

class Chilen extends Parent implements Grant {

     public void doSome(){

     }

    @Override
    void doWome() throws IOException, SQLException {

    }

    public int doGet(int a, float b){

         return 0;
     }

    public int doGet(float b,int a) {

         return 0;

     }
    public void doGet(float b) {

    }


    @Override
    public int fun1(int a, int b) {
        double r = Math.PI;
        int i = (int) Math.PI;
        float q = (float) Math.PI;

        DecimalFormat decimalFormat = new DecimalFormat("#.####");

        System.out.println(decimalFormat.format(r));

        System.out.println(r+"  "+i+"   "+q);

        return 0;
    }

    public static void main(String[] args) {

        new Integer(3);
        int i = new Chilen().fun1(1, 2);
    }

}
