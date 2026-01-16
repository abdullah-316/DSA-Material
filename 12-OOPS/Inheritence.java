public class Inheritence {
    
    public static void main(String[] args) {
        
        Animals cat = new Animals();
        cat.eats();
        cat.sleep();
        
        cat.color = "Blue";
        System.out.println(cat.color);

        Cat c1 = new Cat();
        c1.eats();
        c1.meow();
    }
}

class Animals {

    String color;

    void eats(){
        System.out.println("Eating..");
    }

    void sleep(){
        System.out.println("Sleeping...");
    }
    
}

class Cat extends Animals {

    void meow(){
        System.out.println("Meow");
    }
}

class Dog extends Animals{

    void barking(){
        System.out.println("Boo Boo");
    }
}