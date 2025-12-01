import java.util.Scanner;

public class Accessories {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser: ");
        float eraser = sc.nextFloat();

        float price = pencil + pen + eraser;
        float total = price + ((price * 18) /100);

        System.out.println("Total " + total);
    }
}
