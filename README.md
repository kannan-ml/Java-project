# Java-project
The idea of the project is Railway ticket Reservation system. The project handles the functionality of 
1.book
2.cancel
3.print booked tickets (details with summary)
4.print available tickets (details with summary)

The project takes the initial conditions as 63 berths for 63 confirmed tickets, 9 berths for 18 RAC tickets and 10 tickets in waiting-list. If the waiting-list ticket count goes above 10, print as ‘No tickets available’. The following passenger details should be obtained from the user.
The uppder limit of the initial conditions can be decided by the developer.
1.Name
2.Age
3.Gender
4.Berth preference


Corner cases covered
1.The tickets should not be allocated for children below age 5.But, their details should be stored
2.Lower berth should be allocated for persons whose age is above 60 and ladies with children if available. Side-lower berths should be allocated for RAC passengers.

Conditioins for cancelling tickets:
Whenever a ticket is cancelled, a ticket from RAC should be confirmed and a waiting-list ticket should move to RAC.

I hereby attach sample input and output for the java project
Enter the number of passenger
4
Enter the 1st passenger Name 
passenger1
Enter the passenger1 age
65
Enter the passenger1 Gender(male/female)
male
Enter the passenger1 Bearthpreference
UB
Enter the 2st passenger Name 
passenger2
Enter the passenger2 age
48
Enter the passenger2 Gender(male/female)
male
Enter the passenger2 Bearthpreference
LB
Enter the 3st passenger Name 
passenger3
Enter the passenger3 age
25
Enter the passenger3 Gender(male/female)
male
Enter the passenger3 Bearthpreference
LB
Enter the 4st passenger Name 
passenger4
Enter the passenger4 age
15
Enter the passenger4 Gender(male/female)
female
Enter the passenger4 Bearthpreference
LB

OUTPUT:
==================================Ticket Summary=================================
Ticket Number   Passenger Name   age   Gender   BearthPreference   Bearth Allocated	Ticket Status
      4081		     passenger1		65      male		         UB		            LB		      Confirm
      4082		     passenger2		48      male		         LB		            MB		      Confirm
      4083		     passenger3		25      male		         LB		            MB		      Confirm
      4084		     passenger4		15      female		       LB		            MB		      Confirm
=======================================End=========================================
press 1 to continue
press 2 to view entire history of booking
press 3 for cancellation




