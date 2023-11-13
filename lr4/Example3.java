package lr4;

import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[] [] arr = new int[10][10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                arr[i][j] = 2;
            }
        }

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
