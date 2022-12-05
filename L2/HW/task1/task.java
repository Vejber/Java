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
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        String separator = File.separator;
        String path = separator + "Users" + separator + "zenecka" + separator + "Java" + separator + "L2" + separator
                + "HW" + separator + "task1" + separator + "students.txt";
        File file = new File(path);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // "name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"
                String[] data = line.split(", "); // data = ["name":"Ivanov", "country":"Russia", "city":"Moscow",
                                                  // "age":"null"]
                for (String part : data) {
                    String[] keyValue = part.split(":"); // ["name", "Ivanov"] ["age", "null"]
                    String[] keyLong = keyValue[0].split(""); // [", n, a, m, e, "]
                    String key = "";
                    for (int i = 1; i < keyLong.length - 1; i++) {
                        key = key + keyLong[i]; // name
                    }
                    String[] valueLong = keyValue[1].split(""); // [", n, u, l, l, "]
                    String value = "";
                    for (int j = 1; j < valueLong.length - 1; j++) {
                        value = value + valueLong[j]; // null
                    }
                    if (value != "null") {
                        builder.append(" AND " + key + "=" + '"' + value + '"');
                    }
                }
                String request = builder.toString();
                request = request.substring(5);
                System.out.println("SELECT * FROM students WHERE " + request);
            }
        }
    }
}
