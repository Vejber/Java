// Исправьте код, примените подходящие способы обработки исключений:
package Exceptions.L2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class task4 {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream inputStream;
        try {
            String[] strings = { "apple", "orange" };
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("/broken_reference");
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Индекс выходит за пределы размера массива");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Что-то сломалось");
        } finally {
            System.out.println("Если не выскочило ни одно исключение, я выполнился");
        }
        System.out.println("Я жив!");
    }

    private static void test() throws IOException {
        try {
            File file = new File("1");
            file.createNewFile();
            FileReader reader = new FileReader(file);
            reader.read();
            reader.close();
        } catch (IOException e) {
            System.out.println("Файл не был закрыт");
        }
    }
}
