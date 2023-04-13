// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

package Exceptions.L2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String userFloat = ReturnFloat();
        System.out.println(userFloat);
    }

    public static String ReturnFloat() {
        Scanner floatScanner = new Scanner(System.in);
        System.out.println("Enter your float number > ");
        String floatString = floatScanner.nextLine();
        try {
            Float floatNumber = Float.parseFloat(floatString);
        } catch (RuntimeException e) {
            System.out.println("Your number should be of type float, try again.");
            floatString = ReturnFloat();
        } finally {
            floatScanner.close();
        }
        return floatString;
    }

}
