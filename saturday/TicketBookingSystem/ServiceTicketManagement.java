package saturday.TicketBookingSystem;

/**
 * MARK: ServiceTicketManagement
 * DESC: A thread that manages the process of handing the requests from the queue and generating a ticket
 */

public class ServiceTicketManagement implements Runnable{


    private ServiceRequestQueue serviceRequestQueue;
    public SharedDB sharedDB;

    public ServiceTicketManagement(ServiceRequestQueue serviceRequestQueue, SharedDB sharedDB){
        this.serviceRequestQueue = serviceRequestQueue;
        this.sharedDB = sharedDB;
    }


    @Override
    public void run(){

        while (true) {
            
            sharedDB.create_entry(serviceRequestQueue.take());
            
        }
    }
}
