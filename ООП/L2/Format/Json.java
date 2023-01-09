package ООП.L2.Format;

import java.io.FileWriter;
import java.io.IOException;

import ООП.L2.Document.TextDocument;

// {
// "Иван Иванов": 4.8,
// "Мария Кузнецова": 5.0,
// "Степан Кузьмин": 3.6
// }

public class Json extends TextFormat {

    @Override
    public void SaveAs(TextDocument document, String path) {
        try (FileWriter writer = new FileWriter(path + ".JSON", false)) {
            writer.write("<JSON Format>\n");
            writer.write(document.getDataJSON());
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
