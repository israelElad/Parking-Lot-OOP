# Parking-Lot-OOP
Parking lot management system demonstrating SOLID principles, Object-Oriented-Programming and Design Patterns (Strategy, Iterato, Static Factory Method, Facade, etc).

System features:
* Parking lot can comprise multiple floors
* Each floor can contain different types of parking (for motorcycles, compact, large etc.)
* Upon parking, the vehicle owner receives a parking ticket. Later when he wishes to pay he will be able to do so via both cash and credit.
* There is a flexibility in choosing and changing the formula for calculating the cost by admins.
* In our system, administrators will be able to add / remove floors and parking spaces as needed.
* A digital panel (display board) will be displayed at the entrance of the parking lot and will present details about the status of the various floors.
* Our system is the one responsible for assigning parking locations for vehicles. This placement strategy will be flexible and can be replaced with another at any point.

Future goals: 
* Use proxy instead of facade (for admin privilages).
* Printing - decouple I/O from main logic.
* Add Observer pattern for the display board.
