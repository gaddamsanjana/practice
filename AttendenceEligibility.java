import java.util.Scanner;
public class AttendenceEligibility{
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter attendence percentage:");
    double attendence = sc.nextDouble();
    if (attendence>= 75) {
        System.out.println("Eligible for semester exam");
     } else {
        System.out.println("Not eligible for semester exam");
        sc.close();
    }
    }
}