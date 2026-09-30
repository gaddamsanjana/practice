
public class EvenRollcall {
    public static void main(String[] args) {
        System.out.println("Even Roll numbers (1 - 50):");
        for(int roll = 1; roll <= 50; roll++) {
            if (roll % 2 != 0) {
                continue;


            }
            System.out.print(roll + " ");
            
        }
    }
}
