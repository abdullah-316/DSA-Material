public class Smallest {
    
    public static void smallest(int matrix[][]) {
        
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (small > matrix[i][j]) {
                    small = matrix[i][j];
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (small == matrix[i][j]) {
                    System.out.println("smallest cell (" + i + "," + j + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{2,4,8},
                          {3,0,9},     
                          {1,6,7}};

    smallest(matrix);
    }
}
