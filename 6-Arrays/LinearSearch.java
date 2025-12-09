public class LinearSearch {
    
    // public static int linear(int numbers[], int key) {
        
    //     for (int i = 0; i < numbers.length; i++) {
    //         if (key == numbers[i]) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
    //     int key = 18;

    //     int index = linear(numbers, key);

    //     if (index == -1) {
    //         System.out.println("Key not found");
    //     }
    //     else{
    //         System.out.println("Key is found at index: " + index);
    //     }    
    // }


    public static int items(String menu_cart[], String key ) {
        
        for (int i = 0; i < menu_cart.length; i++) {
            if (menu_cart[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String menu_cart[] = {"Pizza", "Burger", "Shawarma", "Drinks", "Sweets"};
        String key = "kebab";

        int index = items(menu_cart, key);

        if (index == -1) {
            System.out.println("key NOT found");
        } else {
            System.out.println("Found at:" + index);
        }
    }
}
