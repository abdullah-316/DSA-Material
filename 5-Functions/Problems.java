public class Problems {
    
    public static boolean isPowerOfTwo(int n) {
        
        int pow = 0;
        int check = (int)(Math.pow(2,pow));
        if(n == check ){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
}
