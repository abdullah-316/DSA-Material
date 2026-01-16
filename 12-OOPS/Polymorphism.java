public class Polymorphism {
    
    public static void main(String[] args) {
        
        // 1. Method-Overloading Polymorphism
        // Calculator cal = new Calculator();

        // cal.add(10, 5);
        // cal.add(10.10, 5.5);
        // cal.add(10, 20, 30);

        
        // 2. Method-Overriding Polymorphism
        Animal dog = new Dog();

        dog.sound();

    }
}

// 1. Method-Overloading Polymorphism
// class Calculator{
//     void add(int a, int b){
//         System.out.println("The Sum is:" + (a+b));
//     }

//     void add(double  a, double b){
//         System.out.println("The Sum is:" + (a+b));
//     }

//     void add(int a, int b, int c){
//         System.out.println("The Sum is:" + (a+b+c));
//     }
// }

/*
 
📌 Key Points:

* Same method name: add
* Different parameters: 2 int, 2 double, 3 int
* Compiler selects method based on arguments
* No need for inheritance
 
 */


// 2. Method-Overriding Polymorphism
class Animal{
    void sound(){
        System.out.println("Animal makes a Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is Barking");
    }
}
 
/* 

📌 Key Points:

* Dog overrides sound() from Animal
* Java calls Dog’s version of sound() at runtime
* Inheritance is required
* Method name, return type, parameters must be same
 
 */