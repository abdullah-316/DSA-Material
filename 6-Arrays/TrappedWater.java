public class TrappedWater {
    

    public static void trapped(int height[]) {
        int n = height.length;

        // Calculate Left Max
        int maxLeft[] = new int[n];
        maxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i-1]);
        }

        // Calculate Right Max
        int maxRight[] = new int[n];
        maxRight[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i+1]);
        }

        // Intialized Trapped water from 0
        int trappedWater = 0;

        // Loop runs
        for (int i = 0; i < n; i++) {
            // Check min value of maxLeft and maxRight
            int waterLevel = Math.min(maxLeft[i], maxRight[i]);
            // Calculate the trapped water
            trappedWater += waterLevel - height[i];
        }
        System.out.println(trappedWater);
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        trapped(height);
    }
}
