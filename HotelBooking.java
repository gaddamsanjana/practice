import java.util.Scanner;
public class HotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter total rooms
        System.out.print("ENTER TOTAL ROOMS:");
        int total_rooms = sc.nextInt();

        //Enter booked rooms
        System.out.print("ENTER BOOKED ROOMS:");
        int booked_rooms = sc.nextInt();

        //Calculate available rooms
        int available_rooms = total_rooms - booked_rooms;

        //check availability
        if (available_rooms > 0){

            // Calculate occupancy percentage
            double occupancy = ((double) booked_rooms / total_rooms )*100;
            System.out.println("Occupancy = " + occupancy +"%" );
        }else{
            System.out.println("Rooms Not Available");


            
        }
        sc.close();
        
        }
    }

