// В файле содержится строка с исходными данными в такой форме:
//  {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";

// Для разбора строки используйте String.split. 
// Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

package L2.HW.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        String separator = File.separator;
        String path = separator + "Users" + separator + "zenecka" + separator + "Java" + separator + "L2" + separator
                + "HW" + separator + "task1" + separator + "students.txt";
        File file = new File(path);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                // System.out.println(scanner.nextLine());
                String line = scanner.nextLine();
                String[] data = line.split(", "); // data = ["name":"Ivanov", "country":"Russia", "city":"Moscow",
                                                  // "age":"null"]

                // String[] data2 = new String[data.length - 1];
                // // String exclude = "'null'";
                // for (String item : data) {
                // for (int i = 0; i < data2.length; i++) {
                // // if (item.equals(exclude)) {
                // // continue;
                // // }
                // data2[i] = item;
                // }
                // // data2.push(item);
                // }
                for (String part : data) {
                    // String str = part.join(line, part);
                    // if (scanner.nextLine("null"))
                    // ;
                    String[] keyValue = part.split(":"); // ["name", "Ivanov", "age", "null"]
                    String[] keyLong = keyValue[0].split(""); // [", n, a, m, e, "]
                    String key = "";
                    for (int i = 1; i < keyLong.length - 1; i++) {
                        key = key + keyLong[i];
                    }
                    String value = keyValue[1];
                    builder.append(" AND " + key + "=" + value);
                }
                String request = builder.toString();
                request = request.substring(5);
                System.out.println("SELECT * FROM students WHERE " + request);
            }
        }

    }

    private static boolean indexOf(String exclude) {
        return false;
    }

}
