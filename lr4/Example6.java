package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        Random rndm = new Random(10);
        int firstArray[][] = new int[10][10];
        for (int i = 0 ; i <10; i++) {
            for (int j = 0 ; j <10; j++) {
                firstArray[i][j] = rndm.nextInt(9);
                System.out.print(firstArray[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int deletedRow = rndm.nextInt(9);
        int deletedCol = rndm.nextInt(9);
        int secondArray[][] = new int[9][9];

        for (int i = 0, s = 0; i < 9; s++) {
            if (s != deletedRow) {
                for (int j = 0, k = 0; j < 9; k++) {
                    if (k != deletedCol) {
                        secondArray[i][j] = firstArray[s][k];
                        System.out.print(secondArray[i][j]);
                        j++;
                    }
                }
                i++;
                System.out.println();
            }
        }
    }
}
