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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        // конструктор:
        Laptop lenovo = new Laptop(); // экземпляр класса Laptop
        lenovo.name = "lenovo";
        lenovo.ram = 16;
        lenovo.hdVolume = 512;
        lenovo.os = "windows";
        lenovo.color = "black";

        Laptop acer = new Laptop();
        acer.name = "acer";
        acer.ram = 13;
        acer.hdVolume = 350;
        acer.os = "windows";
        acer.color = "white";

        Laptop macbook = new Laptop();
        macbook.name = "macbook";
        macbook.ram = 20;
        macbook.hdVolume = 600;
        macbook.os = "macos";
        macbook.color = "black";

        Laptop hp = new Laptop();
        hp.name = "hp";
        hp.ram = 10;
        hp.hdVolume = 550;
        hp.os = "linux";
        hp.color = "white";
        var laptops = new HashSet<Laptop>(Arrays.asList(lenovo, acer, macbook, hp));
        System.out.println(laptops);

        System.out.println(lenovo.toString());
        String[] userCriteria = request().split("");
        LinkedList<String> sysCriteria = new LinkedList<>();

        for (String item : userCriteria) {
            if (isDigit(item)) {
                sysCriteria.add(item);
            }
        }

        System.out.println(sysCriteria);
        HashMap<String, Object> needs = new HashMap<>();
        for (String item : sysCriteria) {
            switch (item) {
                case ("1"): {

                    System.out.printf("Введите минимальную необходимую величину для ОЗУ: ");
                    String property = iScanner.nextLine();
                    int propertyInt = Integer.parseInt(property);
                    needs.put("ram", propertyInt);
                    break;
                }
                case ("2"): {
                    System.out.printf("Введите минимальную необходимую величину для объема ЖД: ");
                    String property = iScanner.nextLine();
                    int propertyInt = Integer.parseInt(property);
                    needs.put("hdVolume", propertyInt);
                    break;
                }
                case ("3"): {
                    System.out.printf("Введите ОС: ");
                    String property = iScanner.nextLine();
                    property = property.toLowerCase();
                    needs.put("os", property);
                    break;
                }
                case ("4"): {
                    System.out.printf("Введите цвет: ");
                    String property = iScanner.nextLine();
                    property = property.toLowerCase();
                    needs.put("color", property);
                    break;
                }
                default: {
                    continue;
                }
            }
            System.out.println(needs);
        }
        LinkedList<String> result = new LinkedList<>();
        for (String key : needs.keySet()) {
            switch (key) {
                case ("ram"): {
                    Object val = needs.get(key); // {ram = val} to get value
                    Integer valInt = (int) val;
                    for (Laptop stock : laptops) {
                        if (stock.ram >= valInt) {
                            if (!result.contains(stock.name)) {
                                result.add(stock.name);
                            }
                        }
                    }
                    break;
                }
                case ("hdVolume"): {
                    Object val = needs.get(key);
                    Integer valInt = (int) val;
                    for (Laptop stock : laptops) {
                        if (stock.hdVolume >= valInt) {
                            if (!result.contains(stock.name)) {
                                result.add(stock.name);
                            }
                        }
                    }
                    break;
                }
                case ("os"): {
                    Object val = needs.get(key);
                    for (Laptop stock : laptops) {
                        if (stock.os.equals(val)) {
                            if (!result.contains(stock.name)) {
                                result.add(stock.name);
                            }
                        }
                    }
                    break;
                }
                case ("color"): {
                    Object val = needs.get(key);
                    for (Laptop stock : laptops) {
                        if (stock.color.equals(val)) {
                            if (!result.contains(stock.name)) {
                                result.add(stock.name);
                            }
                        }
                    }
                    break;
                }
            }
        }
        iScanner.close();
        System.out.println("Вашему запросу соответствуют ноутбуки: ");
        System.out.println(result);
    }

    static String request() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Введите цифру(цифры), соответствующую(ие) необходимому критерию: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет"); // 1,3
        String criteria = iScanner.nextLine(); // "1,3"
        // iScanner.close();
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
