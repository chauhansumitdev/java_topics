package saturday.TicketBookingSystem;

/**
 * MARK: Request
 * DESC: This is a request thread created by the customer and remains live till it is handled.
 */
public class Request{

    private Customer customer;
    // this ticket number simulates a probable number passed by the customer.
    private int ticket_number;

    public Request(Customer customer ,int ticket_number){
        this.ticket_number = ticket_number;
        this.customer = customer;
    }

    /**
     * MARK: handle_request
     * DESC: This function turns the boolen variable is_handled to true if the request is handled successfully
     */

    public int get_ticket_number(){
        return ticket_number;
    }

    public Customer get_customer(){
        return customer;
    }
}
