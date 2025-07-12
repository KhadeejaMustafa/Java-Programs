# Restaurant Reservation System
A simple Java program to manage restaurant table reservations. 
The restaurant contains three types of tables: small, medium, and large.
<br>Each table is identified through an ID, so the tableID represents the size of the table, where 1 (small), 2 (medium), and 3 (large).
## How it works:
<br> ◾ The program first requires that the total number of available tables be declared. 
<br> ◾ When the function reserve() is called with an argument of either 1, 2 or 3 depending on the table size, 
the system checks if that table is available. 
If true, a reservation is made, and the number of available tables in reduced by one. 
If the desired table is not available, the system returns a False. 
