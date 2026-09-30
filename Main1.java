class Phone{
    void call() {
        System.out.println("Calling...");
    }
}
class SmartPhone extends Phone{
    void browse() {
        System.out.println("Browsing internet...");

    }
}
public class Main1 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();  // Inherited from Phone
        sp.browse(); // own method
    }
}