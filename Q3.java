// Q3 -->
// Method Overriding - Vehicle Movement
// Runtime Polymorophism 


class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle { 
    void move() {
        System.out.println("Car is moving on the road");
    }
}

class Bike extends Vehicle {
    void move() { 
        System.out.println("Bike is moving on two wheels");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Vehicle v;  // Reference of base class

        v = new Car();  // Car object assigned to Vehicle reference
        v.move();       // Calls Car's move()

        v = new Bike(); // Bike object assigned to Vehicle reference
        v.move();       // Calls Bike's move()
    }
}
