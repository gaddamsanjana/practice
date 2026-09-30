

public class ParameterizedConstructor {

    static class Book {
        String title;
        double price;

        Book(String t, double p) {
            title = t;
            price = p;
        }
    }

    public static void main(String[] args) {

        Book b = new Book("Java", 349.0);

        System.out.println(b.title);
        System.out.println(b.price);
    }
}