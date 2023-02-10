package ООП.L7;

import java.util.Scanner;

public class View {

    public void button() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Выберите действие: 1 - Посмотреть список контрагентов; 2 - Найти контрагента по названию. Посмотреть подробную информацию о нём; 3 - Добавить контрагента; 4 - Удалить контрагента; 5 - Добавить новый способ связаться с контрагентом; 6 - Удалить способ связаться с контрагентом  > ");
        String command = iScanner.nextLine();
        if (command.equals("1") || command.equals("2") || command.equals("3") || command.equals("4")
                || command.equals("5") || command.equals("6")) {
            Presenter button = new Presenter(command, null);
            String result = button.action(command);
            System.out.println(result);
        } else {
            System.out.println("Неверная команда.");
        }
    }
}
