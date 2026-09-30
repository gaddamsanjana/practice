public class AdditionOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Two integers: " + add(10, 20));
        System.out.println("Three integers: " + add(10, 20, 30));
        System.out.println("Two decimal numbers: " + add(5.5, 2.5));
    }
}
