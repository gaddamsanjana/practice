import java.util.Scanner;
public class Passwordstrengthchecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password length:");
        int length = sc.nextInt();
        System.out.print("contains digit ? (1 - yes, 0 - no):");

        int hasDigit = sc.nextInt();
        System.out.print("contains special character?(1 - yes,o-no):");

        int hasSpecial = sc.nextInt();
        if (length >= 8) {
            if (hasDigit == 1&& hasSpecial == 1)
            {
                System.out.println("password strength:strong");
            }else{
                System.out.println("password strength weak - missing digit or special character");

            
            }
        }else{
            System.out.println("Password strength: weak - Too short");
            sc.close();

        }
        }

    }
