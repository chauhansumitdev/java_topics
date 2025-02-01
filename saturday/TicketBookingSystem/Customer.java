package saturday.TicketBookingSystem;

/**
 * MARK: Customer
 * DESC : A customer class that main functionality is to create request threads
 */
public class Customer implements Runnable {
    
    private ServiceRequestQueue serviceRequestQueue;
    private boolean status = false;

    public Customer(ServiceRequestQueue serviceRequestQueue){
        this.serviceRequestQueue = serviceRequestQueue;
    }

    @Override
    public void run(){
        serviceRequestQueue.put(create_request());

        while (status != true) {
        }

        System.out.println(" SYSTEM : THREAD EXIT  "+ this + " \u001B[37m" );
    }

    public void set_status(){
        status = true;
    }

    public boolean get_status(){
        return status;
    }

    public Request create_request(){
       return new Request(this, (int)((Math.random() * Global.ticket_count)));
    }
}
