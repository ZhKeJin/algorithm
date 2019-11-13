package homework;

import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2019-11-11-18:02
 */
public class Test1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int w1 = sc.nextInt();
            int h1 = sc.nextInt();
            int w2 = sc.nextInt();
            int h2 = sc.nextInt();
            Rectangle r1 = new Rectangle(w1, h1);
            Rectangle r2 = new Rectangle();
            r2.setWidth(w2);
            r2.setHeight(h2);
            System.out.printf(r1 + ":Perimeter=%6d\t", r1.getPerimeter());
            System.out.printf("Area=%6d\t", r1.getArea());
            System.out.printf(r2 + ":Perimeter=%6d\t", r2.getPerimeter());
            System.out.printf("Area=%6d\t", r2.getArea());
            System.out.printf("Equals=%b\n", r1.equals(r2));
        }
    }
}


class Rectangle {
    int width;
    int height;

    @Override
    public String toString() {
        return "Rectangle(" +
                 width + ", " + height +
                ')';
    }

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPerimeter() {

        return 2 * (width + height);

    }

    public Object getArea() {
        return width * height;
    }

    public boolean equals(Rectangle r2){

        return width*height==r2.height*r2.width;
    }
}