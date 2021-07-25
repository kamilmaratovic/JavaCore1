package lesson11_Enums_toString;

public class HomeWork {
    public static void main(String[] args) {
     Bird paradiseBird = new Bird("Chico", "Starling", "Mix/Rainbow", 2.5, "Paradise bird");
     Bird parrot = new Bird("Sam", "Cockatoo", "Red/White", 11, "Parrot");

     Cat siam = new Cat("Luis", "Siam", "Black/Gray", 1.3, "Full");
     Cat manul = new Cat("Lord", "Manul", "Gray", 5.5, "Partially");

     Dog poodle = new Dog("Larry", "Poodle", "Ginger", 0.5, "Extra small");
     Dog pomeranian = new Dog("Luci", "Pomeranian", "Black", 3.7, "Small");

     Room[] myRooms = {Room.LIVING_ROOM, Room.BATHROOM, Room.KITCHEN, Room.PARLOR, Room.HALL, Room.BACKYARD};
     House myHouse = new House("731 Kathleen Pl", myRooms, 1, 1100);

     myHouse.printInfo();

     Car myCar = new Car("Lexus", "RX350", Colors.BLUE, 2017);
    }


}


// 1. Create a super class and 3 child classes
//create 2 object of each class (including superclass - don't make it abstract)
// 2. Create 2 Enums, Create 2 classes. First using Enum, Second Array of Enums as a Field
