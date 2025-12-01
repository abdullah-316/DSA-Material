// import java.util.Scanner;

public class Example {
    
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Something: ");
        // String name = sc.nextLine();

        // System.out.println(name);
        // System.out.println("Total length:" + name.length());
        // sc.close();


        // String s1 = "Yeet";
        // String s2 = "Yeet";
        // String s3 = new String("Yeet");

        // if (s1 == s2) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }

        // if (s1 == s3) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }

        // // equal() function usage
        // if (s1.equals(s3)) {
        //     System.out.println("Equal");
        // } else {
        //     System.out.println("Not Equal");
        // }

// EXAMPLE1:
        // String str = "Yeet";
        // String str1 = "OTC1";
        // String str2 = "Yeet";

        // System.out.println(str.equals(str1) + " " + str.equals(str2));

        // EXAMPLE2:
        // String str = "Yeetmania".replace("m", "M");
        // System.out.println(str);

        String str = "A man, a plan, a canal: Panama";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            Boolean check = Character.isLetterOrDigit(ch);
            System.out.print(ch+" ");
            System.out.println(check);
        }

    }
}
