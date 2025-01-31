# java_topics

## Day-1
Java : Concurrency , Multithreading	 
Question	 
Thread Pool	Producer-Consumer Problem
Executor Service	 
Semaphores	 	 	 
Blocking Queue	 	 	 
Synchronization	 	 	 
Priority Queue	

## Day-2
 
Java : Java 8, 11, Collections	 	 	 
Question	 
Streams Api	Streams api operations
Use of Optionals	Paraller Stream
Lambda Exprressions, Functional Interfaces	Optionals
Default and static methods on intterfaces	 
 	 
Discussion on How to choose collections ?	Collections Operations


## Day-5
Topics	Database : Relational DB	 	 	 	 	 
S.no	Question	 	Reference
 	Mysql and Nosql	Database designing	 
 	Normalisation	 	 	
 	Triggers	 	 	
 	Joins, Group by, order by	 	 	 	 
 	ACID Properties	 	 	 	 
 	Keys	 	 	 	 
 	Indexing				

## Saturday
### Java - Multithreading
Java : Multithreading
- Problem Statement:
You are tasked with designing a Ticket Booking System where multiple Customers try to book tickets concurrently. The system should handle the Producer-Consumer problem to manage ticket requests, and it should also address race conditions to ensure that tickets are not overbooked or booked multiple times.
Requirements:
1. Ticket Counter (Shared Resource):
Create a TicketCounter class that holds a fixed number of tickets, say 10 tickets.
Customers (threads) should attempt to book tickets from the TicketCounter.
Ensure that if multiple customers try to book tickets at the same time, they cannot book more tickets than are available (this would result in a race condition if not handled properly).
2. Booking Requests (Producer-Consumer):
The system should use a Blocking Queue to handle booking requests.
Producers (customer threads) will add booking requests to the queue.
Consumers (ticket counter thread) will process these requests by assigning available tickets.
If the queue is full, customers should wait until space becomes available. Similarly, if no tickets are available, customers should not be allowed to book.
3. Synchronization:
- Use proper synchronization (i.e., @synchronized or other Java concurrency mechanisms) to ensure that no race conditions occur when multiple threads are accessing and modifying the ticket count simultaneously.
Ensure that only one thread can access and modify the available ticket count at a time.
- Expected Components:
- TicketCounter Class:
- This class should have a method bookTicket(int requestedTickets) that processes the ticket booking. Ensure that the method is synchronized to prevent race conditions.
BookingRequest Class:
- A simple class representing a customer’s booking request, with fields like customer name and the number of tickets requested.
Blocking Queue:
- Use a Blocking Queue to store booking requests. Producers (customers) will add requests to this queue, and the consumer (ticket counter) will take requests and process them.
- Producer-Consumer Threads:
- Producer: Customer threads that generate booking requests and add them to the queue.
- Consumer: The ticket counter thread that processes the booking requests by taking them from the queue and assigning available tickets.
- Main Application:
- Simulate 5-7 customer threads attempting to book tickets.
- The ticket counter should process these requests concurrently, ensuring that no overbooking or double booking occurs.

### ER Diagram
- DB: ER diagram
- Question:
- Design an Entity-Relationship (ER) diagram for a Food Delivery Application. - Your diagram should include entities, relationships, and cardinality constraints. The application should support the following functionalities:
- User Management: Users can register, log in, and place orders. Each user has a User ID, Name, Email, Phone Number, and Address.
- Restaurant Management: Multiple restaurants can register on the platform. Each restaurant has a Restaurant ID, Name, Location, and Cuisine Type.
- Menu Items: Each restaurant offers multiple food items. Each food item has a - Food ID, Name, Price, and Category (e.g., Veg, Non-Veg, Drinks).
- Order Processing: Users can place multiple orders. Each order has an Order ID, Order Date, Total Price, and Payment Status.
- Delivery System: Each order is assigned to a Delivery Partner, who has a Delivery ID, Name, Phone Number, and Vehicle Details.
- Payment System: Users can pay via multiple payment methods. Each payment transaction has a Payment ID, Order ID, Payment Method, and Transaction Status.
Requirements:
- Identify Primary Keys (PK) and Foreign Keys (FK) for each entity.
- Show relationships between User, Restaurant, Food Item, Order, Delivery Partner, and Payment.
- fine the cardinality constraints (e.g., one-to-many, many-to-many).
- Example Scenario:
- A User can place multiple Orders, but each Order belongs to only one User.
- A Restaurant can have multiple Menu Items, but each Menu Item belongs to one Restaurant.
- A Delivery Partner can handle multiple Orders, but each Order is assigned to only one Delivery Partner.

Functionalities:
1. User & Order Management
Users can register and log in.
Users can place and track orders.
Users can update their profile and delivery address.
2. Restaurant & Menu Management
Restaurants can register and list their menu items.
Restaurants can update prices and availability of items.
Users can search for restaurants based on cuisine, location, or ratings.
3. Order Processing & Status Tracking
Users can check the status of their order.
Restaurants can accept or reject orders.
4. Delivery Management
Assigning delivery partners to orders.
Tracking delivery partner location and estimated delivery time.
Delivery partner history and rating management.
5. Payment & Revenue Analysis
Processing online payments and generating invoices.
Revenue calculation for restaurants.
Payment failure handling and refunds.
6. Customer & Restaurant Insights
User ratings and feedback for restaurants.
Identifying top-rated restaurants and dishes.
Personalized recommendations based on order history. (This would involve advanced recommendation algorithms, but a simple approach would be to suggest the most ordered cuisine type for the user. So in a nutshell your ER-diagram should be capable enough to extract order history)
 
Note: The attributes mentioned in the question are just for reference. These are not the only attributes. Think of as many as possible attributes. Each table should have around 8-10 attributes. 