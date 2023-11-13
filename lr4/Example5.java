package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        Random rndm = new Random();

        int height = 7;
        int width = 5;
        int[][] arr = new int[height][width];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = rndm.nextInt(100) + 1;
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        int height2 = width;
        int width2 = height;
        int[][] flipArr = new int[height2][width2];

        for (int i = 0; i < flipArr.length; i++){
            for (int j = 0; j < flipArr[i].length; j++){
                flipArr[i][j] = arr[j][i];
            }
        }
        System.out.println();

        for (int i = 0; i < flipArr.length; i++){
            for (int j = 0; j < flipArr[i].length; j++){
                System.out.print(flipArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
