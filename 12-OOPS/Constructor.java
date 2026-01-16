public class Constructor {
    
    public static void main(String[] args) {
        
        // Passes values to constructor
        Car c1 = new Car("Honda", 2023);

        // Using the constructor without parameters
        Car c2 = new Car();
        c2.model = "Audi";
        c2.year = 2022;

        System.out.println("Car 1: " + c1.model + ", " + c1.year);
        System.out.println("Car 2: " + c2.model + ", " + c2.year);
    }
}

class Car {

    String model;
    int year;
    
    // Constructor: Same name as the class (Car) and no return type
    Car(String model, int year){ // Parameterized constructor
        this.model = model;
        this.year = year;
    }

    // Constructor without parameters (default constructor)
    Car(){
        this.model = "";
        this.year = 0;
    }
}