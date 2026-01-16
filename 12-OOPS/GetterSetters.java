
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
    
}