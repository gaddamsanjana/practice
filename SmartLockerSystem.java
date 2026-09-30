import java.util.Scanner;

public class SmartLockerSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input for five attributes
        System.out.print("Enter Locker Number: ");
        int lockerNumber = sc.nextInt();

        System.out.print("Enter Student ID: ");
        String studentId = sc.next();

        System.out.print("Enter Student Name: ");
        String studentName = sc.next();

        System.out.print("Enter Locker Access PIN: ");
        String accessPin = sc.next();

        System.out.print("Enter Locker Status (Available/Occupied): ");
        String lockerStatus = sc.next();

        // Displaying the entered values
        System.out.println("\n--- Smart Locker Details ---");
        System.out.println("Locker Number: " + lockerNumber);
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Access PIN: " + accessPin);
        System.out.println("Locker Status: " + lockerStatus);

        sc.close();
    }
}