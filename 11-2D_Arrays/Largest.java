public class Largest {
    
    public static int largest(int matrix[][]) {
        int large = Integer.MIN_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (large < matrix[i][j]) {
                    large = matrix[i][j];
                }
            }
        }
        return large;
    }

    public static void print(int mat[][], int largeVal) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (largeVal == mat[i][j]) {
                    
                    System.out.print("largest cell (" + i + "," + j + ")");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{2,5,8},
                          {3,6,9},     
                          {1,4,7}};
        int largeVal = largest(matrix);
        print(matrix, largeVal);
    }
}
