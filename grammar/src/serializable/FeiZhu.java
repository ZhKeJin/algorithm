package serializable;

import com.sun.deploy.ui.FancyButton;
import org.omg.CORBA.StringHolder;

import java.io.*;

/**
 * @author Zhangkj
 * @date 2019-09-15-20:22
 */
public class FeiZhu implements Serializable{

    private static Integer age = 23;
    private String name ;
    private String color;
    private String co;


    public static Integer getAge() {
        return age;
    }

    public static void setAge(Integer age) {
        FeiZhu.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "FeiZhu{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //serializefeizhu();

        FeiZhu deserializefeizhu = deserializefeizhu();

        System.out.println(deserializefeizhu.toString());


    }


    private static void serializefeizhu() throws IOException {
        FeiZhu feiZhu = new FeiZhu();

        feiZhu.setName("张三");
        feiZhu.setColor("red");


        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("D:/feizhu.txt")));

        objectOutputStream.writeObject(feiZhu);

        System.out.println("序列化成功");

        objectOutputStream.close();

    }

    private static FeiZhu deserializefeizhu() throws IOException, ClassNotFoundException {

        ObjectInputStream objectinputStream = new ObjectInputStream(new FileInputStream(new File("D:/feizhu.txt")));

        FeiZhu feiZhu = (FeiZhu) objectinputStream.readObject();

        System.out.println("反序列化成功");

        return feiZhu;

    }


}