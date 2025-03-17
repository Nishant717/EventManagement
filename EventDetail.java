package EventManagement;
import java.time.LocalDate;
import java.util.*;

public class EventDetail {
    public void takeinput(){
        Scanner event_input = new Scanner(System.in);
        System.out.println("Please Enter Event Name");
        String event_name = event_input.nextLine();
        System.out.println("Please Enter Start Event Date YYYY-MM-DD");
        String event_start_date = event_input.nextLine();
        LocalDate start_date = LocalDate.parse(event_start_date);
        System.out.println("Please Enter End Event Date YYYY-MM-DD");
        String event_end_date = event_input.nextLine();
        LocalDate end_date = LocalDate.parse(event_end_date);
        if(start_date.isAfter(end_date))
        {
            System.out.println("Event end date can't be before start date");
        }
        System.out.println("Enter number of Participants");
        Integer participants_count = event_input.nextInt();
        System.out.println("Your Event Name is "+ event_name);
        System.out.println("Your Event Start Date is: "+ start_date);
        System.out.println("Your Event End Date is: "+ end_date);
        System.out.println("Enter name of "+ participants_count + " member");
        }
}
