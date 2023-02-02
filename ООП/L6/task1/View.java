package ООП.L6.task1;

import java.util.Scanner;

public class View {
    public static void button() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Выберите способ разблокировки: 1 - Без пароля; 2 - Пин-код; 3 - Отпечаток пальца; 4 - FaceID > ");
        String command = iScanner.nextLine();
        // iScanner.close();
        if (command.equals("1") || command.equals("2") || command.equals("3") || command.equals("4")) {
            presenter button = new presenter();
            String result = button.action(command);
            System.out.println(result);
        } else {
            System.out.println("Неверная команда.");
        }
    }
}
