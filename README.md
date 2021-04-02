# Parking-Lot-OOP
Parking lot management system demonstrating SOLID principles, Object-Oriented-Programming (OOPs) and Design Patterns(Strategy pattern, Iterator pattern, Static Factory Method pattern, Facade pattern...).

TODO: 
* Use proxy instead of facade(for admin privilages).
* Split main to app.java and main.java, keep main simple and clean.
* Printing- separate I/O from data as using system.out.print violates Dependency Inversion Principle. Use abstraction and create a "display" interface which could be implemented(inherited) as print in console, or in gui etc.
* Add Observer pattern for the display board.
