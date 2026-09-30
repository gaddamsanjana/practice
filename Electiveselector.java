import java.util.Scanner;
public class Electiveselector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1- AI\n2-web Dev\n3-IoI\n4-cybersecurity");
        System.out.print("choose your elective:");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Elective selected: Artificial Intelligence");
                break;
                case 2:
                    System.out.println("Elective selected: web Development");
                    break;
                    case 3:
                        System.out.println("Elective selected: Internet of things");
                        break;
                        case 4:
                            System.out.println("Elective selected: cybersecurity");
                            break;
                            default:
                                System.out.println("Invalid choice");
                                sc.close();
        }
    }
}