import java.util.ArrayDeque;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class App {


    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(5);
        System.out.println(rectangle.getArea()); // 50

        Rectangle rectangle2 = new Square();
        rectangle2.setHeight(10);
        rectangle2.setWidth(5);
        System.out.println(rectangle2.getArea()); // 25
    }
}