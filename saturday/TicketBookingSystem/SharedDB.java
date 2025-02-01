package saturday.TicketBookingSystem;

/**
 * MARK: SharedDB
 * DESC: This class modes a simple database that contains the array data structure for storing references of the customers at specific indexes.
 */
public class SharedDB {
    
    private int remaining_ticket;
    private Customer[] ticket_customer;

    public SharedDB(){
        remaining_ticket = Global.ticket_count;
        ticket_customer = new Customer[Global.ticket_count];
    }

    /**
     * MARK: create_entry
     * DESC: This is used to process a request and store the reference in the array.
     * @param request
     */
    public void create_entry(Request request){
        int ticket_number = request.get_ticket_number();
        Customer customer = request.get_customer();

        if(remaining_ticket == 0){
            print("\u001B[31m DB : ALL TICKETS BOOKED, CANNOT PROCESS REQUEST : \u001B[31m"+request);
        }else if(ticket_customer[ticket_number] != null){
            
            print("\u001B[33m DB : TICKET ALREADY RESERVED, TRY AGAIN \u001B[33m");

        }else{

            synchronized(this){
                if(ticket_customer[ticket_number] == null){
                    ticket_customer[ticket_number] = customer;
                    try{
                        Thread.sleep(200);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    print("\u001B[32m DB : TICKET BOOKED "+ customer+" "+ticket_number+"\u001B[32m");
                    
                    request.get_customer().set_status();
                    System.out.println(request.get_customer().get_status());
                }else{
                    System.out.println("\u001B[31m DB : ERROR PROCESSING REQUEST, TRY AGAIN \u001B[31m");
                }
            }

        }
    }

    /**
     * MARK: print
     * DESC: A helper print function
     * @param str
     */
    public void print(String str){
        System.out.println(str);
    }
    
}
