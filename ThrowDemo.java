public class ThrowDemo {
  static void check(int age) {
    if (age < 18)
      throw new ArithmeticException("Not eligible");
    System.out.println("Eligible");
  }
  public static void main(String[] args) {
    try {
      check(15);
    } catch (ArithmeticException e) {
      System.out.println("Caught: " + e.getMessage());
    }
    check(20);
   }
}
