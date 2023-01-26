package ООП.L5;

import java.util.Scanner;
import ООП.L5.presenter;

public class AttendanceView {
    public static void button() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Выберите действие: 1 - Распечатать всех студентов и посещаемость каждого в процентах; 2 - Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие); 3 - Распечатать студентов с посещаемостью ниже 25%");
        String command = iScanner.nextLine();
        // Integer commandInt = (int) command;
        iScanner.close();
        if (command.equals("1") || command.equals("2") || command.equals("3")) {
            String result = action(command);
            System.out.println(result);
        }
    }
}
