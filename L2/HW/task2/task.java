// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package L2.HW.task2;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
// import java.util.Scanner;
import java.util.logging.*;

public class task {
    /**
     * @param args
     * @throws IOException
     * @throws SecurityException
     */
    public static void main(String[] args) throws SecurityException, IOException {
        String separator = File.separator;
        String path = separator + "Users" + separator + "zenecka" + separator + "Java" + separator + "L2" + separator
                + "HW" + separator + "task2" + separator + "log.txt";
        FileHandler fh = new FileHandler(path);
        int[] arr = { 5, 1, 4, 8, 3, 12, 10 };
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            Logger LOGGER = Logger.getLogger(task.class.getName());
            LOGGER.setLevel(Level.INFO);
            ConsoleHandler ch = new ConsoleHandler();
            LOGGER.addHandler(ch);
            LOGGER.addHandler(fh);
            SimpleFormatter sf = new SimpleFormatter();
            ch.setFormatter(sf);
            fh.setFormatter(sf);
            String x = Arrays.toString(arr);
            LOGGER.info(x);
        }
    }
}
