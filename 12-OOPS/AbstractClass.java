public class AbstractClass {
    
    public static void main(String[] args) {
        
         // Animal a = new Animal(); ❌ Not allowed
         Dog pups = new Dog(); // ✅ Allowed
         pups.eat();
         pups.sound();

         Cat mano = new Cat();
         mano.eat();
         mano.sound();
       
    }
}

abstract class Animal{
    void eat(){ // Concrete method 
        System.out.println("Animal can eat");
    }

    abstract void sound(); // Abstract method (no body)
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barking");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Meow...");
    }
}
/*
  
 🧠 Explanation:

* Animal is abstract → can’t make object of it
* sound() method is abstract → defined in Dog class
* eat() method is concrete → reused in Dog
 
 */
