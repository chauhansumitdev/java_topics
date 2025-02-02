package saturday.TicketBookingSystem;

public class Main {
    
    public static void main(String[] args) {
        
        TicketBookingSystem ticketBookingSystem = new TicketBookingSystem();

        //manual mode
        // ticketBookingSystem.add_customer();
        // ticketBookingSystem.add_customer();
        // ticketBookingSystem.add_customer();

        // automatic mode
        ticketBookingSystem.start_system();

    }
}
