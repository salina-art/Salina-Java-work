package III;

public class TwoDArrayExample {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) { // Outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) { // Inner loop for columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}

