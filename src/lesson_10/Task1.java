package lesson_10;

import java.util.Scanner;

public class Task1 {
    final static String WIDTH_REQUEST_MESSAGE= "Ширина: ";
    final static String HEIGHT_REQUEST_MESSAGE= "Высота: ";
    final static String CORNER = "  ";
    final static String HORIZONTAL_LINE = "==";
    final static String VERTICAL_LINE = "||";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = dataRequest(WIDTH_REQUEST_MESSAGE);
        int height = dataRequest(HEIGHT_REQUEST_MESSAGE);
        scanner.close();

        drawHorizontalLine(width); // Рисуем верхнюю линию
        drawVerticalLine(width, height); // Рисуем "стены"
        drawHorizontalLine(width); // Рисуем нижнюю линию
    }

    public static void drawHorizontalLine (int width){
        System.out.print(CORNER);
        for (int i = 0; i < width; i++) {
            System.out.print(HORIZONTAL_LINE);
        }
        System.out.println(CORNER);
    }

    public static void drawVerticalLine (int width,int height ){
        for (int i = 0; i < height; i++) {
            System.out.print(VERTICAL_LINE);
            for (int j = 0; j < width; j++) {
                System.out.print(CORNER);
            }
            System.out.println(VERTICAL_LINE);
        }
    }

    public static int dataRequest (String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }


}
