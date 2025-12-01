public class ShortestPath {
    
    public static void checkShortestPath(String str) {
        
        int x =0, y=0;
        double path = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'W') {
                x--;
            }
            else if (dir == 'E') {
                x++;
            }
            else if (dir == 'S') {
                y--;
            }
            else{
                y++;
            }
        }
        path = Math.sqrt((x*x) + (y*y));
        System.out.println("Shortest path is: " + path);
        
    }
    public static void main(String[] args) {
        // String str = "WNEENESENNN";
        String str = "SNS";
        checkShortestPath(str);
    }
}
