public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Integer[] number = new Integer[1];
        number[0] = 10;
        Integer[] ref = number;

        System.out.println("before");
        System.out.println(number[0]);     // 10
        System.out.println(ref[0]);        // 10

        ref[0] = 15;

        System.out.println("after");
        System.out.println(number[0]);     // 15
        System.out.println(ref[0]);        // 15
    }
}