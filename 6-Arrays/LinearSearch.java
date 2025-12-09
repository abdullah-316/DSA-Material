public class LinearSearch {
    
    public static int linear(int numbers[], int key) {
        
        for (int i = 0; i < numbers.length; i++) {
            if (key == numbers[i]) {
                return i;
            }
        }
        return -1;
    }


    public static int items(String menu_cart[], String key ) {
        
        for (int i = 0; i < menu_cart.length; i++) {
            if (menu_cart[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        // Check for numbers..
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 18;

        int idx = linear(numbers, key);

        if (idx == -1) {
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key is found at index: " + idx);
        }    


        // Check for items..
        String menu_cart[] = {"Pizza", "Burger", "Shawarma", "Drinks", "Sweets"};
        String target = "kebab";

        int index = items(menu_cart, target);

        if (index == -1) {
            System.out.println("key NOT found");
        } else {
            System.out.println("Found at:" + index);
        }
    }
}
