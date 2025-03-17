package EventManagement;
import java.util.*;

public class EventMain {
    public static void main(String[] args) {
            Scanner to_do = new Scanner(System.in);
            System.out.println("Enter 1 to add event");
            System.out.println("Enter 2 to check event details");
            System.out.println("Enter 3 to delete event");
            Integer user_input = to_do.nextInt();
            // This is a switch case statement
            switch(user_input)
            {
                case 1:
                EventDetail obj = new EventDetail();
                obj.takeinput();
                break;
                case 2:
                System.out.println("Please Check Event Details");
                break;
                case 3:
                System.out.println("Enter Event Name To Delete Event");
                break;
                default:
                System.out.println("Invalid Input");
                break;
            }
        
    }
}
