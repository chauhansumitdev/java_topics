package saturday.TicketBookingSystem;

import java.util.*;

/**
 * MARK: TicketBookingSystem
 * DESC: This class is the main class that allows to create customers and process the request
 */
public class TicketBookingSystem {

    private ServiceRequestQueue serviceRequestQueue;
    private List<Customer> customer;
    private ServiceTicketManagement serviceTicketManagement;
    private SharedDB sharedDB;


    public TicketBookingSystem(){
        serviceRequestQueue = new ServiceRequestQueue(Global.blocking_queue_size);
        customer = new ArrayList<>();
        sharedDB = new SharedDB();
        serviceTicketManagement = new ServiceTicketManagement(serviceRequestQueue, sharedDB);
        // start the ticket management service for booking the ticket
        new Thread(serviceTicketManagement).start();
    }

    /**
     * MARK: add_customer
     * DESC: This is used to create a customer and add it into the list that further create requests
     */
    public void add_customer(){
        customer.add(new Customer(serviceRequestQueue));
    }

    /**
     * MARK: start_system
     * DESC: This function starts the system and considers two cases, first if there is any customer object created and present in the list then it goes on to further process their requests otherwise it switches to simulation mode (automatic system working mode)
     */
    public void start_system(){

        if(customer.size() != 0 ){
            System.out.println("\u001B[37m SYSTEM : PROCESSING CUSTOMERS ... \u001B[37m");

            for(Customer current_customer : customer){
                
                new Thread(current_customer).start();
            }

        }else{
            System.out.println("\u001B[37m SYSTEM : NO DIRECT CUSTOMERS, STARTING SIMULATION MODE \u001B[37m");
            simulation_mode();
        }
    }

    /**
     * MARK: simulation_mode
     * DESC: This function is used to start a automatic mode that keeps on generating customer threads and futher handles their requests
     */
    private void simulation_mode(){
        while(true){

            new Thread(new Customer(serviceRequestQueue)).start();

        }
    }
}
