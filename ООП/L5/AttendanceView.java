package ООП.L5;

import java.util.Scanner;

public class AttendanceView {
    public static void button() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Выберите действие: 1 - Распечатать всех студентов и посещаемость каждого в процентах; 2 - Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие); 3 - Распечатать студентов с посещаемостью ниже 25 процентов > ");
        String command = iScanner.nextLine();
        iScanner.close();
        if (command.equals("1") || command.equals("2") || command.equals("3")) {
            presenter button = new presenter();
            String result = button.action(command);
            System.out.println(result);
        } else {
            System.out.println("Неверная команда.");
        }
    }
}
