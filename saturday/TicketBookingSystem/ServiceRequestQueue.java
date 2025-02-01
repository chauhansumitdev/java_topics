package saturday.TicketBookingSystem;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
/**
 * MARK: ServiceRequestQueue
 * DESC: This class uses the blocking queue for storing, adding and removing the requests
 */
public class ServiceRequestQueue {
   private BlockingQueue<Request> blockingQueue;
   private int capacity;

   public ServiceRequestQueue(int capacity) {
      blockingQueue = new ArrayBlockingQueue<>(capacity);
      this.capacity = capacity;
   }

   /**
    * MARK: put
    * DESC:  used to insert a request in the queue  
    * @param var1
    */
   public void put(Request request) {
      if (this.blockingQueue.size() == this.capacity) {
         System.out.println("\u001b[33m SYSTEM : QUEUE FULL, MOVED REQUEST TO BLOCKING STAGE : \u001b[33m" + request);
      }

      try {
         System.out.println("\u001b[33m SYSTEM : QUEUED REQUEST : \u001b[33m" +request);
         this.blockingQueue.put(request);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   /**
    * MARK: take
    * DESC: used to remove a request from the queue
    * @return
    */
   public Request take() {
      if (this.blockingQueue.size() == 0) {
         System.out.println(" \u001b[37m SYSTEM : NO REQUEST TO PROCESS  \u001b[37m");
      }

      try {
         return (Request)this.blockingQueue.take();
      } catch (Exception var2) {
         var2.printStackTrace();
         return null;
      }
   }
}