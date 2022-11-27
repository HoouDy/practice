package lesson_4;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String horizontalLine = "-";
        String corner = " ";
        String verticalLine = "|";

        System.out.print("Ширина: ");
        int width = scanner.nextInt();
        System.out.print("Высота: ");
        int height = scanner.nextInt();
        scanner.close();

        // Рисуем верхнюю линию
        System.out.print(corner);
        for (int i = 0; i < width; i++) {
            System.out.print(horizontalLine);
        }
        System.out.println(corner);


        // Рисуем "стены"
        for (int i = 0; i < height-2; i++) {
            System.out.print(verticalLine);
            for (int j = 0; j < width; j++) {
                System.out.print(corner);
            }
            System.out.println(verticalLine);
        }

        // Рисуем нижнюю линию
        System.out.print(corner);
        for (int i = 0; i < width; i++) {
            System.out.print(horizontalLine);
        }
        System.out.println(corner);





    }


}
