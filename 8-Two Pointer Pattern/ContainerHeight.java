public class ContainerHeight {
    
    public static void container(int height[]) {
        
        int left = 0, right = height.length-1;
        int maxArea = 0;

        while (left < right) {
            int area = 0;
            area = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            }
            else{
                right--;
            }
        }
        System.out.println("Max Area: "+maxArea);
    }
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        container(height);
    }
}
