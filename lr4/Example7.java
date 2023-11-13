package lr4;

public class Example7 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        int count = 0;
        int num = 0;
        int h = 0;
        for (int i = 0; h < arr.length ; h++) {
            for (int j = 0; j < (arr[i].length - count); j++) {              //заполнение верхней строки слева-направо
                arr[i][j] = num;
                num++;
            }
            if(i < arr.length - 1) i++;
            for (int k = 4; k > count; k--) {                                //заполнение правого столбца снизу-вверх
                arr[k][arr[i].length - 1 - count] = num;
                num++;
            }
            count++;
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }
}
