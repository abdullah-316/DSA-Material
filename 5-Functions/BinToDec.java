public class BinToDec {
    
    public static void binToDec(int n) {
        
        int binNum = n;
        int pow = 0;
        int dec = 0;

        while (n>0) {
            
            int last = n%10;
            dec = dec + (last * (int)(Math.pow(2, pow)));
            pow++;
            n = n / 10;
        }

        System.out.println("Decimal of " + binNum + " is " + dec);
    }
    public static void main(String[] args) {
        
        binToDec(101);
    }
}
