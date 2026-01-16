
public class GetterSetters {
    
   public static void main(String[] args) {
     Person p1 = new Person();
     p1.setPassword("abc123");
     System.out.println(p1.getPassword());
    
   }
}

class Person {
        private String password;

        // Get the value from private variables.
        String getPassword(){
            return password;
        }

        // Set the values for the password field.
        void setPassword(String pwd){
            this.password = pwd;
        }
    
class Student {
        private String name;
        private int age;
    
        // Getter for name
        public String getName() {
            return name;
        }
    
        // Setter for name
        public void setName(String n) {
            name = n;
        }
    
        // Getter for age
        public int getAge() {
            return age;
        }
    
        // Setter for age with condition
        public void setAge(int a) {
            if(a > 0) {
                age = a;
            }
        }
    }


    /*
     * Defination:
                  "Getters and setters are used to access and update private variables of a class. They support encapsulation and allow us to add logic, such as validation, before changing values."

     * Diagram Style (Text-Based):
     
    Class: Student
     ---------------------
     | private name       |
     | private age        |
     ---------------------
     | getName()          |
     | setName(String n)  |
     | getAge()           |
     | setAge(int a)      |
     ---------------------

     Access:
     s.setName("Ali");   ✅
     s.getName();        ✅
     s.name = "Ali";     ❌ (Not allowed — it's private)
     
     */
        
}

