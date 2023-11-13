package lr4;

public class Example4 {
    public static void main(String[] args) {
        int rows = 10;
        int cols = 10;
        char[][] triangle = new char[rows][cols];


        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                if (j <= i) {
                    triangle[i][j] = '2';
                }
                j++;
            }
            i++;
        }

        for (i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }
}
