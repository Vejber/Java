// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
// и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Laptop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        // конструктор:
        Laptop lenovo = new Laptop(); // экземпляр класса Laptop
        lenovo.ram = 16;
        lenovo.hdVolume = 512;
        lenovo.os = "windows";
        lenovo.color = "black";

        Laptop acer = new Laptop();
        acer.ram = 13;
        acer.hdVolume = 350;
        acer.os = "windows";
        acer.color = "white";

        Laptop macbook = new Laptop();
        macbook.ram = 20;
        macbook.hdVolume = 600;
        macbook.os = "macos";
        macbook.color = "black";

        Laptop hp = new Laptop();
        hp.ram = 10;
        hp.hdVolume = 550;
        hp.os = "linux";
        hp.color = "white";

        var laptops = new HashSet<Laptop>(Arrays.asList(lenovo, acer, macbook, hp));

        // System.out.println(l1.toString());
        String[] userCriteria = request().split(""); // make array ["1", ",", "3"]
        LinkedList<String> sysCriteria = new LinkedList<>();

        for (String item : userCriteria) {
            if (isDigit(item)) {
                sysCriteria.add(item);
            }
        }

        System.out.println(sysCriteria); // ["1","3"]

        HashMap<String, String> needs = new HashMap<>();
        for (String item : sysCriteria) {
            // Scanner iScanner = new Scanner(System.in);
            switch (item) {
                case ("1"): {
                    // Scanner iScanner = new Scanner(System.in);

                    System.out.printf("Введите минимальную необходимую величину для ОЗУ: ");
                    String property = iScanner.nextLine();
                    // iScanner.close();
                    needs.put("ram", property);
                    break;
                }
                case ("2"): {
                    // Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите минимальную необходимую величину для объема ЖД: ");
                    String property = iScanner.nextLine();
                    // iScanner.close();
                    needs.put("hdVolume", property);
                    break;
                }
                case ("3"): {
                    // Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите ОС: ");
                    String property = iScanner.nextLine();
                    // iScanner.close();
                    needs.put("os", property);
                    break;
                }
                case ("4"): {
                    // Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите цвет: ");
                    String property = iScanner.nextLine();
                    // iScanner.close();
                    needs.put("color", property);
                    break;
                }
                default: {
                    continue;
                }
            }
            // iScanner.close();

            System.out.println(needs);

        }
        iScanner.close();
    }

    static String request() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Введите цифру(цифры), соответствующую(ие) необходимому критерию: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет"); // 1,3
        String criteria = iScanner.nextLine(); // "1,3"
        iScanner.close();
        return criteria;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
