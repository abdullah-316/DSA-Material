public class NthTerm {
    
    public static void AP(int a1, int a2, int n) {
        int nth = a1;
        int dis = a2-a1;

        for (int i = 1; i < n; i++) {
            nth += dis;
        }
        System.out.println(nth);
    }
    public static void main(String[] args) {
        int a1 = 1, a2 = 3, n = 10;
        AP(a1, a2, n);
    }
}
