public class ContainerHeight {
    
    public static void container(int height[]) {
        
        int start = 0, end = height.length-1;
        int maxArea = 0;

        while (start < end) {
            int area = 0;
            area = Math.min(height[start], height[end]) * (end-start);
            maxArea = Math.max(maxArea, area);

            if (height[start] < height[end]) {
                start++;
            }
            else{
                end--;
            }
        }
        System.out.println("Max Area: "+maxArea);
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        container(height);
    }
}
