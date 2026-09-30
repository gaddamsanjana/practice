import java.util.Scanner;
public class RegistrationSlotValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day(1-7)");
        int day = sc.nextInt();
        System.out.print("Enter hour(o - 23):"); 
              int hour = sc.nextInt();
        if(day >= 1&& day <= 5){
            if (hour >= 9 && hour <17){
                System.out.println("Registration Allowled");
            }else{
                System.out.println("Registration closed - outside Hours");
            }
        }else{
            System.out.println("Registration closed - weekend");
            sc.close();
            


        }
    
            }
            }
        

    
    
