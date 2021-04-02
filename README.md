# Parking-Lot-OOP
Parking lot management system demonstrating SOLID principles, Object-Oriented-Programming (OOPs) and Design Patterns(Strategy pattern, Iterator pattern, Static Factory Method pattern, Facade pattern...).

System features:
* Managed parking lot can be multi-storey
* Each floor can contain different types of parking (for motorcycles, compact, large ...) so that each type of vehicle has defined parking spaces.
* When parking, the vehicle owner gets a parking card, and later when he wants to pay he will be able to do so in both cash and credit.
* There is flexibility in choosing and changing the formula for calculating the cost by admins.
* In our system, administrators will be able to add / remove floors (levels) and parking spaces as needed.
* A digital panel (display board) will be displayed at the entrance to the parking lot and will detail the status of the various floors.
* Our system is the one that will determine for each vehicle within the desired floor the exact location to park inside the parking lot. This placement strategy will be flexible and can be replaced with another at any point.

Future goals: 
* Use proxy instead of facade(for admin privilages).
* Split main to app.java and main.java, keep main simple and clean.
* Printing- separate I/O from data as using system.out.print violates Dependency Inversion Principle. Use abstraction and create a "display" interface which could be implemented(inherited) as print in console, or in gui etc.
* Add Observer pattern for the display board.
