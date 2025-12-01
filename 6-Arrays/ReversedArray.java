public class ReversedArray {
    
    public static void reversed(int num[]) {
        int n = num.length;
        int start = 0, end = n-1;

        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;

        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};

        reversed(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] +" ");
        }
    }
}
