public class Macierz {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        int x = matrix[2][1]; // poprawione (było 4][2] - błąd)
        System.out.println(x);
    }
}