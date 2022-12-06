// В файле содержится строка с данными:

// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, 
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:

// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package L2.HW.task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class task {
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder builder = new StringBuilder();
        String separator = File.separator;
        String path = separator + "Users" + separator + "zenecka" + separator + "Java" + separator + "L2" + separator
                + "HW" + separator + "task3" + separator + "students.txt";
        File file = new File(path);
        String temp = "";
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // "фамилия":"Иванов","оценка":"5","предмет":"Математика"
                String[] data = line.split(","); // data = ["фамилия":"Иванов","оценка":"5","предмет":"Математика"]
                for (String part : data) {
                    String[] keyValue = part.split(":"); // ["фамилия", "Иванов"]
                    String[] valueLong = keyValue[1].split(""); // [", и, в, а, н, о, в, "]
                    String value = "";
                    for (int j = 1; j < valueLong.length - 1; j++) {
                        value = value + valueLong[j]; // иванов
                    }
                    temp += value + " ";
                }
                String[] result = temp.split(" ");
                builder.append("Студент " + result[0] + " получил " + result[1] + " по предмету " + result[2] + ".");
                temp = "";
            }
            String request = builder.toString();
            System.out.println(request);
            String[] task = request.split("."); // create array
        }
    }
}
