package homework;

import java.util.Scanner;

/**
 * @author Zhangkj
 * @date 2019-11-11-16:54
 */
public class Homework {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2;
        while (sc.hasNext()) {
            x1 = sc.nextDouble();
            y1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y2 = sc.nextDouble();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Line l = new Line(p1, p2);
            System.out.printf("Lenght=%.2f\t", l.length());
            System.out.printf("Is Horizontal=%b\t", l.isHorizontal());
            System.out.printf("Is Vertical=%b\t", l.isVertical());
            System.out.printf("Slope=%.2f\t", l.slope());
            System.out.printf("MidPoint=%s\n", l.getMidPoint().toString());
        }
    }


}

class Point {

    double x;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double y;


    @Override
    public String toString() {
        return "(" +
                String.format("x=%.2f",x) +
                "," + String.format("y=%.2f",y) +
                ')';
    }
}

class Line {

    Point point;
    Point point1;


    public Line(Point point, Point point1) {
        this.point = point;
        this.point1 = point1;

    }

    public Double length() {

        return Math.sqrt(Math.pow((point.x - point1.x), 2) + Math.pow((point.y - point1.y), 2));
    }

    public boolean isHorizontal() {

        return point.x != point1.x && point.y == point.y;

    }

    public boolean isVertical() {
        return point.x == point1.x && point.y != point.y;

    }


    public double slope() {

        if (point.x - point1.x == 0)
            return -1;
        if (point.y - point1.y == 0)
            return 0;

        return (point.y - point1.y) / (point.x - point1.x);
    }

    public Point getMidPoint() {
        return new Point((point.x + point1.x) / 2.0, (point.y + point1.y) / 2.0);
    }
}
