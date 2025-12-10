public class SubArray {

    public static void sub_array(int num[]) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");

                }
                System.out.println();

            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int num[] = { 1, 3, 5, 7, 9 };
        sub_array(num);
    }
}
