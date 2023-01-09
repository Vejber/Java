// Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).

// Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах:

// Просто текст:

// Иван Иванов=4.8
// Мария Кузнецова=5.0
// Степан Кузьмин=3.6

// JSON:

// {
// "Иван Иванов": 4.8,
// "Мария Кузнецова": 5.0,
// "Степан Кузьмин": 3.6
// }

// XML:

// <?xml version="1.0" encoding="utf-8" ?>
// <students>
// <student>
// <name>Иван Иванов</name>
// <grade>4.8</grade>
// </student>
// <student>
// <name>Мария Кузнецова</name>
// <grade>5.0</grade>
// </student>
// <student>
// <name>Степан Кузьмин</name>
// <grade>3.6</grade>
// </student>
// </students>

package ООП.L2;

import ООП.L2.Applications.Notepad;
import ООП.L2.Format.*;

public class Program {
    public static void main(String[] args) {

        String students = "Иван Иванов=4.8,Мария Кузнецова=5.0,Степан Кузьмин=3.6";

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText(students);
        // notes.currentDocument().addAllText(students);
        // notes.currentDocument().addAllText(students);
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Json());
        notes.SaveAs("file3", new Xml());
    }
}
