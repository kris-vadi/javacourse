package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorNumber = scanner.nextInt();

        if (floorNumber >= 1 && floorNumber <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (floorNumber >= 5 && floorNumber <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floorNumber >= 9 ) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
