import java.util.Scanner;
public class SemesterCreditCounter{
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalCredits = 0;
        int coursecount = 0;
        int credit;
        do{
            System.out.print("Enter credits for course" +(coursecount+1) +":");
            credit = sc.nextInt();
            totalCredits += credit;
            coursecount++;
        } while(totalCredits<20);
        System.out.println("Total credits reached:" + totalCredits);
        System.out.println("Number of courses:" + coursecount);
        sc.close();
        



        }
    }
