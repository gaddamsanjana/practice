public class MultiCatch {
  public static void main(String[] args) {
    try {
      String s = null;
      System.out.println(s.length());
    } catch (ArithmeticException
             | NullPointerException e) {
      System.out.println("Caught: "
        + e.getClass().getSimpleName());
    }
  }
}