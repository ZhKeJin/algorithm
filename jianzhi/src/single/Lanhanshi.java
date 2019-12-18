package single;

import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.plugin2.message.GetAppletMessage;

/**
 * @author Zhangkj
 * @date 2019-12-17-22:56
 */
public class Lanhanshi {

    public Lanhanshi(){

    }

    private static volatile Lanhanshi lanhanshi = null;

    public static Lanhanshi getInstance() {

        if (lanhanshi == null) {
            synchronized (Lanhanshi.class) {
                if (lanhanshi == null) {

                    lanhanshi = new Lanhanshi();

                }
            }

        }

        return lanhanshi;
    }

}
