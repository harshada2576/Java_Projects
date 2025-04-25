import java.util.Scanner; 
import java.time.LocalDate; 
import java.time.format.DateTimeParseException; 
 
// Custom Exception 
class InvalidCheckInDateException extends Exception { 
    public InvalidCheckInDateException(String message) { 
        super(message); 
    } 
} 
 
// HotelBooking Class 
class HotelBooking { 
    public void bookRoom(String checkInDate) throws 
InvalidCheckInDateException { 
        try { 
            LocalDate checkIn = LocalDate.parse(checkInDate); 
            LocalDate today = LocalDate.now(); 
 
            if (checkIn.isBefore(today)) { 
                throw new InvalidCheckInDateException("Invalid 
check-in date! The date must be today or later."); 
            } 
            System.out.println("Room booked successfully for " 
+ checkInDate); 
        } catch (DateTimeParseException e) { 
            throw new InvalidCheckInDateException("Invalid 
date format! Use YYYY-MM-DD."); 
        } 
    } 
} 
 
// Main Class 
public class H16 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        HotelBooking booking = new HotelBooking(); 
 
        System.out.print("Enter check-in date (YYYY-MM-DD): 
"); 
        String checkInDate = sc.next(); 
 
        try { 
            booking.bookRoom(checkInDate); 
        } catch (InvalidCheckInDateException e) { 
            System.out.println("Error: " + e.getMessage()); 
        } 
 
        sc.close(); 
    } 
}
