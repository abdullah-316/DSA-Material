import java.util.Scanner;

public class TestMethod {
    
    public static Boolean isEven(int n) {
        
        if (n%2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value:");
        int value = sc.nextInt();

        if (isEven(value)) {
            System.out.println(value +" is an Even Number");
        }
        else{
            System.out.println(value +" is an Odd Number");
        }

    }
}
