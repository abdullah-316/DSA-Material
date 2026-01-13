public class Search {
    
    public static void search(int matrix[][], int key) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("fount at: (" + i + "," + j + ")");
                }
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{2,4,6},
                          {1,3,5},     
                          {9,8,7}};
    search(matrix, 3);
    }
}
