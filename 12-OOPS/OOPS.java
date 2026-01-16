public class OOPS {
    
    public static void main(String[] args) {
        // Create a Student object called s1
        Student s1 = new Student();
        s1.setName("hadi");
        System.out.println(s1.name);
        s1.setRoll(1234);
        System.out.println(s1.rollno);
        
    }
}

class Student {

    String name;
    int rollno;

    // Creation of methods
    void setName(String newName){
        name = newName;
    }
    void setRoll(int roll){
        rollno = roll;
    }
}