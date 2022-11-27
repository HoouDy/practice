package lesson_6;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ширина: ");
        int width = scanner.nextInt();
        System.out.print("Высота: ");
        int height = scanner.nextInt();
        scanner.close();


        drawHorizontalLine(width); // Рисуем верхнюю линию
        drawVerticalLine(width, height); // Рисуем "стены"
        drawHorizontalLine(width); // Рисуем нижнюю линию
    }

    public static void drawHorizontalLine (int width){
        System.out.print(" ");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }

    public static void drawVerticalLine (int width,int height ){
        for (int i = 0; i < height-2; i++) {
            System.out.print("|");
            for (int j = 0; j < width; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

}
