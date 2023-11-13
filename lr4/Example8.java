package lr4;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ (в цифрах): ");
        int shift = in.nextInt();
        char[] ArrayText = text.toCharArray();
        int[] CharCode = new int[ArrayText.length];
        for (int i = 0; i < ArrayText.length; i++) {
            CharCode[i] = ArrayText[i];
            CharCode[i] = CharCode[i] + shift;
        }
        for (int i = 0; i < ArrayText.length; i++) {
            ArrayText[i] = (char) CharCode[i];
        }
        String encryptText = new String(ArrayText);

        System.out.println("Текст после преобразования: " + encryptText);
        System.out.print("Выполнить обратное преобразование? (y/n)");
        boolean cont = false;
        while (!cont) {
            String reply = in.next();
            if (reply.toLowerCase().equals("y")) {
                char[] ArrayText1 = encryptText.toCharArray();
                int[] CharCode1 = new int[ArrayText1.length];
                for (int i = 0; i < ArrayText1.length; i++) {
                    CharCode1[i] = ArrayText1[i];
                    CharCode1[i] = CharCode1[i] - shift;
                }
                for (int i = 0; i < ArrayText1.length; i++) {
                    ArrayText1[i] = (char) CharCode1[i];
                }
                String DecryptText = new String(ArrayText1);

                System.out.println(DecryptText);
                cont = true;
            } else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                cont = true;
            } else {
                System.out.println("Введите корректный ответ: ");
                cont = false;
            }
        }
    }
}
